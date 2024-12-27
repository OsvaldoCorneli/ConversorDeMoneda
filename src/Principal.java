import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
            double valor, values, resultado;

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("ARS");
                    System.out.println("El valor de " + valor + " dolares es igual a: " + values * valor + " pesos argentinos.");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("ARS");
                    resultado = valor/values;
                    System.out.println("El valor de " + valor + " pesos argentinos es igual a: " + String.format("%.2f", resultado)+ " dolares.");
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("BRL");
                    System.out.println("El valor de " + valor + " dolares es igual a :" + values*valor + " Reales brasileños.");
                    break;
                case 4:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("BRL");
                    resultado = valor/values;
                    System.out.println("El valor de " + valor + " reales brasileños es igual a: " + String.format("%.2f", resultado)+ " dolares.");
                    break;
                case 5:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("COP");
                    resultado = valor*values;
                    System.out.println("El valor de " + valor + " dolares es igual a: " + resultado +" pesos colombianos.");
                    break;
                case 6:
                    System.out.println("Ingrese el valor que desea convertir: ");
                    valor = teclado.nextDouble();
                    values = consulta.encontrarValor("COP");
                    resultado = valor/values;
                    System.out.println("El valor de " + valor + " pesos colombianos es igual a: " + String.format("%.2f", resultado) +" dolares.");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;

            }


        }

    }
}