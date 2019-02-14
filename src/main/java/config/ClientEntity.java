package config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientEntity {

    /**
     * ip : 192.168.17.47
     * port : 2005
     * rpc_secret_key : 769af463a39f077a0340a189e9c1ec28
     * secret :
     * user :
     */

    private String ip;
    private int port;
    private String rpc_secret_key;
    private String secret;
    private String user;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getRpc_secret_key() {
        return rpc_secret_key;
    }

    public void setRpc_secret_key(String rpc_secret_key) {
        this.rpc_secret_key = rpc_secret_key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
