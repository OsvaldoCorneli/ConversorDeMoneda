import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsumirAPI consulta = new ConsumirAPI();

        String mensaje = """
                **************************************************
                
                ¡Bienvenida/o al conversor de moneda de ONE!
                
                
                1) Dolar =>> Peso Argentino.
                2) Peso Argentino =>> Dolar.
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar.
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                9) ¡Salir!
                
                **************************************************
                
                Por favor ingrese una opcion valida:
                """;

        while(true){

            System.out.println(mensaje);
            Scanner teclado = new Scanner(System.in);

            int opcion = teclado.nextInt();
            if(opcion == 9){
                System.out.println("¡Gracias por utilizar nuestro conversor!");
                break;
            }
            System.out.println(opcion);


        }










       // Monedas respuesta = consulta.encontrarValor("ARS");

      //  System.out.println(respuesta);

    }
}