package clases;

public class EmploStringConcatenacion {

    public static void main(String[] args) {
        String curso = "Programaion en java"; 
        String profesor = " Samuel Arandia ";
        
        String detalle = curso + " con el instrutor "+ profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + " numeroB + numeroA = " + (numeroB + numeroA));

        System.out.println(numeroA+ numeroB +  detalle);

        String detalle2 = curso.concat(" con el instructor".concat(profesor));
        System.out.println( detalle2 );

    }
}
