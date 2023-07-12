package clases;

public class EjemploStringExtensionArc {

    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");
        System.out.println("i = " + i);
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}
