package clases;

public class SentenciaBucleEtiquetas {

    public static void main(String[] args) {

        bucle:
        for (int i = 1; i <= 7 ; i++) {

            int j = 1;
            while ( j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": Descando de fin de semana");
                    continue bucle  ;
                }
                System.out.println("Dia " + i + " Trabajando a las "+ j + "hrs.");
                j++;
            }
        }
        System.out.println("\n======================================");

        bucle1:
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("\n======================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue etiqueta;
                }
                System.out.print("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}