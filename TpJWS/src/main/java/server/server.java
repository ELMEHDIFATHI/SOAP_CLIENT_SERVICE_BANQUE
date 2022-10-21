package server;

import jakarta.xml.ws.Endpoint;
import ws.serviceBanque;

public class server {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0:8084/",new serviceBanque());
        System.out.println("web service deploye");
    }
}
