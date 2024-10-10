package main.java.com.currency_converter.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientUtil {
    public String sendGetRequest(String endpoint) throws Exception {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/34b8cdf5c7d6806a0a6db1b6/" + endpoint);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
