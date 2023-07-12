package clases;

public class PrimitivosLong {

        static float varFlotante;

        public static void main(String [] args ) {
            float realFloat = 1.0f;
            System.out.println("realFloat = " + realFloat);

            float realFloat2 = 2.12e3f;
            System.out.println("realFloat = " + realFloat2);

            float realFloat3 = 2.15e-3f;
            System.out.println("realFloat3 = " + realFloat3);
            System.out.println("El valor minimo de float es: " + Float.MIN_VALUE);
            System.out.println("El valor maximo de float es: " + Float.MAX_VALUE);
            System.out.println("El valor  en byte de float es: " + Float.BYTES);
            System.out.println("El tamano de float es: " + Float.SIZE);

            double realDouble = 3.4028235E39;
            System.out.println("realDouble = " + realDouble);
            System.out.println("El valor minimo de doble es: " + Double.MIN_VALUE);
            System.out.println("El valor maximo de doble es: " + Double.MAX_VALUE);
            System.out.println("El valor  en byte de doble es: " + Double.BYTES);
            System.out.println("El tamano de doble es: " + Double.SIZE);

            System.out.println(" la varible flotante es = " + varFlotante);


        }

}
