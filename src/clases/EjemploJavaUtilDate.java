package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha actual: " + fecha);

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr = dt.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        SimpleDateFormat dt2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSS");
        String fechaStr2 = dt2.format(fecha);
        System.out.println("fechaStr2 = " + fechaStr2);


        long j = 0;
        for (int i = 0; i < 1000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);
    }
}
