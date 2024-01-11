import java.util.Scanner;

public class Menu {

    public void imprimirMenu() {

        int opcion = 0;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("=========================================================");
            System.out.println("ArithmeticException (1)");
            System.out.println("InputMismatchException (2)");
            System.out.println("StringIndexOutOfBoundsException (3)");
            System.out.println("SALIR (0)");
            System.out.println("=========================================================");

            Excepciones excepciones = new Excepciones();

            do {

                System.out.println("\nINGRESE UNA OPCIÓN");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        excepciones.exception1();

                        break;
                    case 2:

                        excepciones.exception2();

                        break;
                    case 3:

                        excepciones.exception3();

                        break;
                    case 0:

                        System.out.println("ADIOS");

                        break;

                    default:

                        System.out.println("OPCION NO VALIDA");

                        break;
                }
            } while ((opcion < 0) || (opcion > 3));

        }while (opcion != 0);
    }
}


