package clases;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);

        System.out.println(num1 == num2);

        num2 = 500;
        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        System.out.println(num1 == num2);

        System.out.println(num1.equals(num2));

        System.out.println("Tiene el mismo valor " + (num1.intValue() == num2.intValue()));
        boolean condicion = num1 > num2;
        System.out.println("num1 > num2 = " + condicion);
    }
}
