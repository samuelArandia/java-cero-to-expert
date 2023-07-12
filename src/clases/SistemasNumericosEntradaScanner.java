package clases;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args ){

//        Sistema decimal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
//        String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "El Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

//        Sistemas octal
        String resultadoOctal = "\nEl numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

//        sistema hexadecimal
        String resultadoHexadecimal = "\nEl numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHexadecimal;
        System.out.println( mensaje );
    }
}
