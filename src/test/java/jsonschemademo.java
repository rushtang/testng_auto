import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.*;
import com.github.fge.jackson.JsonLoader;
import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.github.fge.jsonschema.main.*;
import com.github.fge.jsonschema.core.report.ProcessingReport;


import java.io.IOException;

public class jsonschemademo {

     static void demo() throws IOException, ProcessingException,NullPointerException{


        ObjectNode schema =(ObjectNode)JsonLoader.fromResource("/data/jsonschme/jumei_product/JumeiProduct_Cache_Read/deal.json");
        ObjectNode response=(ObjectNode)JsonLoader.fromResource("/data/response/demo.json");

        ObjectNode Schemaproperties= (ObjectNode) schema.get("properties");
        ObjectNode field_hash_id=(ObjectNode) Schemaproperties.get("hash_id1");


        Schemaproperties.put("bj130424p61141",field_hash_id);
        Schemaproperties.remove("hash_id1");

        schema.put("properties",Schemaproperties);
        ArrayNode required=(ArrayNode)schema.get("required");
        required.add("bj130424p61141");
        schema.put("required",required);

        System.out.println(schema.toString());

        JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
        JsonSchema jsonschema = factory.getJsonSchema(schema);

        ProcessingReport report=jsonschema.validate(response);
        System.out.println(report);

        System.out.println(report.toString().contains("ListProcessingReport: success"));

    }

    public static void main(String[] args ) throws IOException, ProcessingException {

        demo();

    }

}
