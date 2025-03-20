package clases;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean condicion = num1 > num2;
        System.out.println("num1 > num2 = " + condicion);

        Boolean objBoolean = Boolean.valueOf(condicion);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;
        boolean objBoolean4 = false;

        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean.booleanValue() = " + objBoolean.booleanValue());

        System.out.println("Comparando dos objetos Boolean: " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos Boolean: " + (objBoolean == objBoolean3));

        System.out.println("Comparando dos primitivos boolean: " + (objBoolean3 == objBoolean4));
    }
}
