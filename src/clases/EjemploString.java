package clases;

public class EjemploString {

    public static void main(String[] args) {
        String curso = "Programacion en Java";
        String curso2 = new String("Programacion en Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso) = " + esIgual);
        
        esIgual = curso.equalsIgnoreCase(curso2); // Si tomar cuenta de matuscular y minusculas
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programacion en Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
