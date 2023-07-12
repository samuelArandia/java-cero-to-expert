package clases;

import javax.swing.*;

public class OperadoresArimetico {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        int sumar = a + b;
        System.out.println("suma  = " + sumar);

        int resta = a - b;
        System.out.println("resta = " + resta);

        int multiplicacion = a * b;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = a / b;
        float division2 = (float) a / (float) b;
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);

        int resto = a % b;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero"));
        
        if (numero % 2 == 0) {
            System.out.println("Es numero par = " + numero);
        } else {
            System.out.println("numero es impar= " + numero);
        }

    }
}
