import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url="https://api.weatherbit.io/v2.0/current?lat=28.644&lon=77.216&key=dfed8211fdc1433394bd453c0c40224d&include=24hour";
        // building request object
        HttpRequest request= HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        // setting the httpclient
        HttpClient httpClient =HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse= httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.body());
    }
}