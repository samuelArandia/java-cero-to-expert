package clases;

public class EjemploStringMetodosArreglos {

    public static void main(String[] args) {
        String hipotalamo = "hipotalamo";

        System.out.println("hipotalamo.toCharArray() = " + hipotalamo.toCharArray());

        char[] arreglo = hipotalamo.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for( int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }
        System.out.println();
        System.out.println("hipotalamo usando el metodo split = " + hipotalamo.split("a"));

        String[] arreglo2 = hipotalamo.split("a");
        int largo2 = arreglo2.length;
        for( int j = 0; j < largo2; j++){
            System.out.print( arreglo2[j] );
        }

        String archivo = "algun.documento.pdf";
        String[] archivoArr = archivo.split("\\.");
        int l = archivoArr.length;
        for (int k = 0; k < l; k++){
            System.out.print( archivoArr[k].concat(" ") );
        }
    }
}
