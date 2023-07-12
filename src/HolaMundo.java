//Mi clase de java
import java.io.IOException;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String args[]) {
        String nombre = "Samuel";
        String saludar = " Hola desde java, ";
        System.out.println(saludar + nombre.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("valor = " + valor);
            numero2= 12;
        }
            System.out.println("Es falso y el numero es: " + numero2 );


    }
}
