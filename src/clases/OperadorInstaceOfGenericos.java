package clases;

public class OperadorInstaceOfGenericos {

    public static void main(String[] args) {

        Object text = "Creando un objeto de la clase String... que tal!";

        Number num = Integer.valueOf(7);//7

        Boolean b1 = text instanceof String;
        System.out.println("b1 = " + b1);

        b1 = text instanceof String;
        System.out.println("text es de tipo string= " + b1);

        b1 = text instanceof Object;
        System.out.println("text es de tipo object= " + b1);

        b1 = num instanceof  Integer;
        System.out.println("num es tipo interger= " + b1);

        b1 = num instanceof  Number;
        System.out.println("num es de tipo number= " + b1);
        
        b1 = num instanceof Object;
        System.out.println("num es de tipo Object= " + b1);

        b1 = num instanceof Long;
        System.out.println("num es de tipo Long= " + b1);

        b1 = num instanceof Double;
        System.out.println("num es de tipo doble= " + b1);
        
        Double decimal = 45.45;

        b1 = decimal instanceof Number;
        System.out.println("b5 = " + b1);

        b1 = decimal instanceof Double;
        System.out.println("b5 = " + b1);

//        b1 = decimal instanceof Float;
//        System.out.println("b5 = " + b1);


        
        b1 = b1 instanceof Boolean;
        System.out.println("b5 = " + b1);


    }
}
