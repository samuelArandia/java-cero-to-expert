package clases;

public class SentenciaBuclesEtiquetasBuscar {

    public static void main(String[] args) {


        String frase = "tres triste tigres tragaban trigo en un trigal";
        String palabra = "trigo";

        int maxFrase = frase.length();
        int maxPalabras = palabra.length();

        int cantiada = 0;
        char letra = 'g';

        buscar:
        for ( int i = 0; i < maxFrase ; i++){

            int k = i;
            for ( int j = 0; j < maxPalabras; j++){

                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantiada++;
        }
        System.out.println("El total buscado es = " + cantiada + " de la palabra = "+ palabra);
    }
}
