package lib.rpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Response {
    private String response_str;
    private JsonNode response_node;

    public void set_str(String response){
        this.response_str=response;
    }
    public void set_node(String response){

        ObjectMapper mapper = new ObjectMapper();
        try {
            this.response_node = mapper.readTree(response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String get_str(){
        System.out.printf(this.response_str);
        return  this.response_str;
    }

    public JsonNode get_node(){

        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.printf(mapper.writeValueAsString(this.response_node));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return  this.response_node;
    }
}
