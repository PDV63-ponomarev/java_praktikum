package networkRequests3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class parametrsString3 {

    public static void main(String[] args) {
//        simpleHeader();
        jsonHeader();
        xmlHeader();

    }

    private static void simpleHeader(){
        HttpClient client = HttpClient.newHttpClient();

        URI url = URI.create("https://api.agify.io/?name=Pixel");
        HttpRequest request = HttpRequest.newBuilder().uri(url).GET().build();

        //отправка запроса
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println("Код состояния: " + response.statusCode());
            System.out.println("Ответ: " + response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте URL");
        }
    }

    private static void jsonHeader(){
        HttpClient client = HttpClient.newHttpClient();

        URI url = URI.create("https://api.agify.io/?name=Pixel");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .header("Accept","application/json")
                .GET()
                .build();

        //отправка запроса
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println("Код состояния: " + response.statusCode());
            System.out.println("Ответ в формате JSON: " + response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте URL");
        }
    }

    private static void xmlHeader(){
        HttpClient client = HttpClient.newHttpClient();

        URI url = URI.create("https://api.agify.io/?name=Pixel");
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .header("Accept","application/xml")
                .GET()
                .build();

        //отправка запроса
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            System.out.println("Код состояния: " + response.statusCode());
            System.out.println("Ответ в формате XML: " + response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте URL");
        }
    }
}
