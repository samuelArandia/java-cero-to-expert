package clases;

public class PrimitivosCaracteres {

    public static void main(String[] args) {
//        Caracteres unicode
        char charater = '\u0040';
        char decimal = 64;
        System.out.println("charater:   " + charater);
        System.out.println("Decimal: "+ decimal );
        System.out.println("El decimal es igual a character: " + (decimal == charater));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo y charater = " + (simbolo == charater));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("espacio = " + espacio);

        System.out.println("Char corresponde en byte: " + System.lineSeparator() + Character.BYTES);
        System.out.println("Char corresponde en espacio " + Character.SIZE);
        System.out.println("eL Maximo de charact corresponde a: " + Character.MAX_VALUE);
        System.out.println("eL Minimo de charact corresponde a: " + Character.MIN_VALUE);

    }
}
