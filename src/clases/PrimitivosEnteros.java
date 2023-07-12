package clases;

public class PrimitivosEnteros {

    public static void main(String [] args) {
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("numeroByte = " + Byte.BYTES);
        System.out.println("tipo de byte corresponde en bite a = " + Byte.SIZE);
        System.out.println("valor minimo de un byte  = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de un byte  = " + Byte.MAX_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroShort = " + Short.BYTES);
        System.out.println("numeroShort = " + Short.SIZE);
        System.out.println("valor minimo de un short  = " + Short.MIN_VALUE);
        System.out.println("Valor maximo de un short  = " + Short.MAX_VALUE);

        int numeroInt = 32767;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("numeroInt = " + Integer.BYTES);
        System.out.println("numeroInt = " + Integer.SIZE);
        System.out.println("valor minimo de un int  = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de un int  = " + Integer.MAX_VALUE);

        long numeroLong = 32767;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("numeroLong = " + Long.BYTES);
        System.out.println("numeroLong = " + Long.SIZE);
        System.out.println("valor minimo de un long  = " + Long.MIN_VALUE);
        System.out.println("Valor maximo de un long  = " + Long.MAX_VALUE);

    }
}
