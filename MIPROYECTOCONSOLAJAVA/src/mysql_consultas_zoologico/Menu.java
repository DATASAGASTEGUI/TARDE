package mysql_consultas_zoologico; 

import java.io.IOException; 
import libreria.Metodos;

public class Menu {

    static OperacionesCrud crud = new OperacionesCrud();

    public static void main(String[] args) {
        do {
            cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. LOS ANIMALES NACIDOS EN EL AÑO 2016");
            
            System.out.println("2. Mostrar la ciudad con el mayor monto acumulado");
            System.out.println("3. Mostrar todas las ciuadades distintas");
            System.out.println("4. Mostrar la zona con la mayor venta");
            System.out.println("0. Salir");

            int opcion = Metodos.validarEntradaEntero("\nIngrese opcion? ");

            switch (opcion) {
                case 1:
                    cls();
                    opcion1();
                    pause();
                    break;
                case 2:
                    cls();
                    opcion2();
                    pause();
                    break;
                case 3:
                    cls();
                    opcion3();
                    pause();
                    break;
                case 4:
                    cls();
                    opcion4();
                    pause();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);

    }

    public static void opcion1() {
        System.out.println("OPCION 1");
        System.out.println("--------");
        crud.animalesNacidosAnio();

    }

    public static void opcion2() {
        System.out.println("OPCION 2");
        System.out.println("--------");
    }

    public static void opcion3() {
        System.out.println("OPCION 3");
        System.out.println("--------");
    }

    public static void opcion4() {
        System.out.println("OPCION 4");
        System.out.println("--------");
    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
