package clases;

public class ConversionDeTipos {

    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1231.23";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);


        String logicStr = "True";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logicBoolean = " + logicBoolean);


        int otroNumeroInt = 1000;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i = 32768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);

    }
}
