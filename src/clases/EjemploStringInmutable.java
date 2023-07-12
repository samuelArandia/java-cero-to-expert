package clases;

public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = " Programacion en Java";
        String profesor = "Samuel Arandia";

        String resultado = curso.concat(" ").concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println("curso = " + curso);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        } );
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
    }
}
