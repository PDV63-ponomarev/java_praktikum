package networkRequests3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Errors2 {

    public static void main(String[] args){
        int requestedStatus = 404;

        URI uri = URI.create("https://httpbin.org/status/" + requestedStatus);

        // создание запроса
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        //создангие hhtp клиента
        HttpClient client = HttpClient.newHttpClient();

        //отправка запроса
        try {
            HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());

            int status = response.statusCode();

            if (status >= 200 && status <= 299){
                System.out.println("Сервер успешно обработал запрос. Код состояния " + status);
                return;
            }
            if (status >= 400 && status <= 499) {
                System.out.println("Сервер сообщил о проблеме с запросом. Код состояния " + status);
                return;
            }
            if (status >= 500 && status <= 599) {
                System.out.println("Сервер сообщил о проблеме с сервером. Код состояния " + status);
                return;
            }
            if (status >= 300 && status <= 399) {
                System.out.println("Сервер сообщил о перенаправлении. Код состояния " + status);
                return;
            }
            if (status >= 100 && status <= 199) {
                System.out.println("Информация поступила, процесс продолжается. Код состояния " + status);
                return;
            }
        } catch (Exception e){
            System.out.println("Во время выполнения запроса возникла ошибка. Проверьте URL");
        }

    }
}
