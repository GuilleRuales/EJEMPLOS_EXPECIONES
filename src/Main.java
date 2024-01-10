import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 2 valores a dividir");

        try {
            System.out.print("Ingresa el primer valor(numerador): ");
            int valor1 = scanner.nextInt();

            System.out.print("Ingresa el segundo valor(denominador): ");
            int valor2 = scanner.nextInt();

            int resultado = valor1 / valor2;
            System.out.println("El resultado es: "+resultado);

        }catch(Exception e){
            System.out.println("No se puede dividir para 0");
        }

        System.out.println("--------------------------------------------");

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);
        } catch (Exception e) {
            System.out.println("Debe ingresar un numero entero. ");

        }

        System.out.println("--------------------------------------------");

        try {
            System.out.println("Ingresa una palabra de 5 letras");
            String palabra = scanner.next();
            char letra = palabra.charAt(4);

            System.out.println("Se mostrara la ultima letra a continuación");
            System.out.println("La ultima letra es: "+letra);
        }catch (Exception e){
            System.out.println("La palabra no tiene 5 letras");
        }

    }

}