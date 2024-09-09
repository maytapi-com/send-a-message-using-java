package com.example;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.JSONObject;

public class SendMessage {
    public static void main(String[] args) {
        String productId = ConfigLoader.getProperty("product.id");
        String phoneId = ConfigLoader.getProperty("phone.id");
        String apiKey = ConfigLoader.getProperty("api.key");

        String url = "https://api.maytapi.com/api/" + productId + "/" + phoneId + "/sendMessage";

        JSONObject body = new JSONObject();
        body.put("to_number", "905301234567");
        body.put("type", "text");
        body.put("message", "Hello World");

        HttpResponse<String> response = Unirest.post(url)
                .header("x-maytapi-key", apiKey)
                .header("content-type", "application/json")
                .body(body.toString())
                .asString();

        System.out.println("Response: " + response.getBody());
    }
}