package createAPI2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;


// открыть в браузере http://localhost:8080/hello
// открытие сайта равноценно GET запросу


public class Endpoints2{

    private static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create();

        httpServer.bind(new InetSocketAddress(PORT), 0);
        httpServer.createContext("/hello", new HelloHandler());
        httpServer.start(); //запуск сервера

        System.out.println("HTTP-сервер запущен на " + PORT + " порту");
    }

    static class HelloHandler  implements HttpHandler {
        // метод обработки запроса
        @Override
        public void handle(HttpExchange httpExchange) throws IOException {

            System.out.println("Началась обработка /hello запроса от клиента");

            // метод отправляет ответ, сформированный заранее.

            String response = "Hey! Glad to see you!";
            // rCode - код ответа, responseLength - длина ответа в байтах, 0 размер не учитывается
            httpExchange.sendResponseHeaders(200, 0);

            // OutputStream исп для передачи данных связанных с телом ответа
            // позволяет записывать данные в виде массива байтов
            try (OutputStream os = httpExchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        }
    }
}
