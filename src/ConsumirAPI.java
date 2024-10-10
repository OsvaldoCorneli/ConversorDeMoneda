import com.google.gson.Gson;
import java.util.Map;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumirAPI {

    Monedas encontrarValor(String moneda) throws IOException, InterruptedException {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fc33ae91f7a56e3bc0f73fd0/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Monedas respuesta = new Gson().fromJson(response.body(), Monedas.class);

        Map<String, Double> conversionRates = respuesta.conversion_rates();
        Double valor = conversionRates.get(moneda);

        if (valor != null) {
            System.out.println("El valor de " + moneda + " es: " + valor);
        } else {
            System.out.println("La clave " + moneda + " no se encuentra en el mapa.");
        }


        System.out.println("monedas " + respuesta.conversion_rates());

        return new Gson().fromJson(response.body(), Monedas.class);
    }



}
