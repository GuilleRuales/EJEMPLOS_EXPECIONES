import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    Scanner scanner = new Scanner(System.in);

    public void exception1 (){
        System.out.println("Ingrese 2 valores a dividir");

        try {
            System.out.print("Ingresa el primer valor(numerador): ");
            int valor1 = scanner.nextInt();

            System.out.print("Ingresa el segundo valor(denominador): ");
            int valor2 = scanner.nextInt();

            int resultado = valor1 / valor2;
            System.out.println("El resultado es: "+resultado);

        }catch(ArithmeticException e){
            System.out.println("No se puede dividir para 0");
        }
    }

    public void exception2 (){
        try {
            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero. ");

        }
    }

    public void exception3 (){
        try {
            System.out.println("Ingresa una palabra de 5 letras");
            String palabra = scanner.next();
            char letra = palabra.charAt(4);

            System.out.println("Se mostrara la ultima letra a continuación");
            System.out.println("La ultima letra es: "+letra);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("La palabra no tiene 5 letras");
        }
    }

}
