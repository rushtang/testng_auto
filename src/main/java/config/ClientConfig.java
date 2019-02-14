package config;

import java.net.URL;

public class ClientConfig {


    public static String getOperation(){

        return getabspath("config/OperationClient.yaml");

    }

    public static String getProduct(){

        return getabspath("config/ProductClient.yaml");

    }


    private static String getabspath(String configpath){
        URL Path= ClientEntity.class.getClassLoader().getResource(configpath);
        return Path.getPath();

    }

}
