package clases;

public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if ( esNulo ){
            curso = "Programacion en java";
        }

        boolean esVacio = curso.length() == 0;

        if (!esVacio) {
            System.out.println("Esta vacio");
        }
        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso de ".concat(curso).concat(" Desde cero"));

        boolean esVacio2 = curso.isEmpty();

        if ( !esVacio2 ) {
            System.out.println("esVacio2 = " + esVacio2);
            System.out.println("curso = " + curso);
        }

    }
}
