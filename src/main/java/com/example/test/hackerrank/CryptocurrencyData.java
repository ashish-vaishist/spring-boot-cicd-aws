package com.example.test.hackerrank;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CryptocurrencyData {


    public static void getdata() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://bitcoin-calculator.p.rapidapi.com/api3/btc/400"))
                .header("x-rapidapi-key", "372a6bd1b0mshec3f21e0f92ec31p1b6f54jsn585a77c1abbd")
                .header("x-rapidapi-host", "bitcoin-calculator.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();


        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }

    public static void main(String[] args) {
        try {
            getdata();
        }
        catch (IOException| InterruptedException e ){

            System.out.println(e.getMessage());
        }



    }
}
