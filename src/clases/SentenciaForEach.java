package clases;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5 ,9 ,11 ,15 ,16};

        for ( int num: numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"samuel", "daniela", "Moises", "maria","Lorenzo", "sarina", "ramon"};

        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
