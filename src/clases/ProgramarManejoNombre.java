package clases;

import java.util.Scanner;

public class ProgramarManejoNombre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String familiar1 = null;
        String familiar2 = null;
        String familiar3 = null;

        System.out.println("Ingreser el familiar numero1: ");
        familiar1 = scanner.nextLine();
        System.out.println("Ingreser el familiar numero2: ");
        familiar2 = scanner.nextLine();
        System.out.println("Ingreser el familiar numero3: ");
        familiar3= scanner.nextLine();

        familiar1 = cambioNombre(familiar1);
        familiar2 = cambioNombre(familiar2);
        familiar3 = cambioNombre(familiar3);


        String resultado = familiar1.concat("_").concat(familiar2).concat("_").concat(familiar3);
        System.out.println("resultado = " + resultado);
    }

    private static String cambioNombre(String nombre) {
        String segundoCaracterMayuscula = Character.toUpperCase(nombre.charAt(1))+"";
        String ultimoCaracter =  nombre.substring(nombre.length() - 2);

        return segundoCaracterMayuscula + "." + ultimoCaracter;
    }
}