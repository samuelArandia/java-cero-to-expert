package clases;

import java.util.Scanner;

public class SentenciaSwitchCase {

    public static void main(String[] args) {
        int num = 2;

        switch (num) {
            case 0:
                System.out.println("El numero es cero");
                break;
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            default:
                System.out.println("El numero o caracter es desconocido");
        }

        String nombre = "samuel";

        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido");
                break;
            case "lorenzo":
                System.out.println("Hola lorenzo, bienvenido");
                break;
            case "Moises":
                System.out.println("Hola moises, bienvenido");
                break;
            case "samuel":
                System.out.println("Hola samuel, bienvenido");
                break;
            default:
                System.out.println("Usuario no encontrado");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingres el mes en numero ente 1 y 12 ");
        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;

            case 2:
                nombreMes = "Febrero";
                break;

            case 3:
                nombreMes = "Marzo";
                break;

            case 4:
                nombreMes = "Abril";
                break;

            case 5:
                nombreMes = "Mayo";
                break;

            case 6:
                nombreMes = "Junio";
                break;

            case 7:
                nombreMes = "Julio";
                break;

            case 8:
                nombreMes = "Agosto";
                break;

            case 9:
                nombreMes = "Septiembre";
                break;

            case 10:
                nombreMes = "Octubre";
                break;

            case 11:
                nombreMes = "Noviembre";
                break;

            case 12:
                nombreMes = "Diciembre";
                break;

            default:
                nombreMes = "Mes no válido";
        }

        System.out.println("El nombre del mes es: " + nombreMes);


    }

}
