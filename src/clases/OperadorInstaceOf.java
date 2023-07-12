package clases;

public class OperadorInstaceOf {

    public static void main(String[] args) {

        String text = new String( "Creando un objeto de la clase String... que tal!");
        Integer num = 7;

        boolean b1 = text instanceof String;
        System.out.println("Texto es del tipo Sting " + b1);

        boolean b2 = text instanceof Object;
        System.out.println("b2 = " + b2);

        boolean b3 = num instanceof  Integer;
        System.out.println("b3 = " + b3);

        boolean b4 = num instanceof  Number;
        System.out.println("b4 = " + b4);


    }
}
