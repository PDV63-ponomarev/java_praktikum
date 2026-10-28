package networkRequests3;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CreateHTTPClient1 {

    public static void main(String[] args) throws IOException, InterruptedException {
        // создание экземпляра URI, содержащий адрес нужного ресурса
        URI uri = URI.create("https://httpstatuses.io/418");


        // создаем Объект, описывающий HTTP-запрос
        HttpRequest request = HttpRequest.newBuilder() // получение экземпляра билдера
                .GET() // указание HTTP-метода запроса
                .uri(uri) // указание адреса ресурса
                .version(HttpClient.Version.HTTP_1_1) // указание версии протокола
                .header("Accept", "text/html") // указание заколовка Accept
                .build(); // завершение настроек и создание ("строим") http-запроса

        // HTTP клиент с настройками по умолчанию
        HttpClient client = HttpClient.newHttpClient();

        // получение стандартного обработчкиа тела запроса с конверт содержимого в строку
        HttpResponse.BodyHandler<String> handler = HttpResponse.BodyHandlers.ofString();

        // отправление запроса и получение ответа от сервера
        HttpResponse<String> response = client.send(request, handler);

        // вывод кода состояния и тела ответа
        System.out.println("Код ответа: " + response.statusCode());
        System.out.println("Тело ответа " + response.body());
    }
}
