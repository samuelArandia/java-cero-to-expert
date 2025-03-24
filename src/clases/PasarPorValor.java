package clases;

public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("i = " + i);
        cambiarValor(i);
        System.out.println("i = " + i);
    }

    private static void cambiarValor(int i) {
        System.out.println("i = " + i);
        i = 15;
        System.out.println("i = " + i);
    }
}
