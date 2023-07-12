package clases;

public class PrimitivosBoolean {
    public static void main( String[] args ) {
        boolean dataLogico = true;
        System.out.println("dataLogico = " + dataLogico);

        double d = 12312.3e-3;//12.312.3
        System.out.println("d = " + d);
        float f = 1.2312e3f; //1.23.12e3f
        System.out.println("f = " + f);

        dataLogico = d > f;
        System.out.println("dataLogico = " + dataLogico);


        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }

}
