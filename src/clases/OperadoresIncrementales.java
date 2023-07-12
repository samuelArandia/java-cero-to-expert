package clases;

public class OperadoresIncrementales {

    public static void main(String[] args) {

//       pre-incremento
        int a = 1;
        System.out.println("a = " + a);
        int b = ++a;// b = b + a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        post-incremento
        a = 2;
        b = a++;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

//      pre-decremento
        a = 3;
        b = --a; // a = a - 1= 2
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        post-Decremento
        a = 4;
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("(++b) = " + (++b));
    }
}
