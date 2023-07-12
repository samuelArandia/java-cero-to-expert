package clases;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 7 ? "Si es verdadero " : " Es falso";

        String estado = "";
        double promedio = 6.2;
        double matematicas = 0.0;
        double ciencia = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2 y 7");
        matematicas= scanner.nextDouble();
        System.out.println("Ingrese la nota de ciencias entre 2 y 7");
        ciencia = scanner.nextDouble();
        System.out.println("Ingrese la nota de historia entre 2 y 7");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencia + historia ) / 3;

        estado = promedio >= 5.9 ? "Aprobado" : "Rechazado";
        System.out.println("promedio = " + promedio);
        System.out.println("promedio = " + estado);

    }
}
