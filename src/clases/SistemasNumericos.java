package clases;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args ){

//        Sistema decimal
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero entero:");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "El Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println( resultadoBinario );

        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

//        Sistemas octal
        String resultadoOctal = "\nEl numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println( resultadoOctal );
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

//        sistema hexadecimal
        String resultadoHexadecimal = "\nEl numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println( resultadoHexadecimal );

        String mensaje = resultadoBinario;
        mensaje += resultadoOctal;
        mensaje += resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
