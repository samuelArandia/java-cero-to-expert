package clases;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad  ={ 10, 11, 12 };
        System.out.println("iniciamos el metodo main");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de llamar al metodo cambiarValor");
        cambiarValor(edad);
        System.out.println("Despues de llamar al metodo cambiarValor");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main");
    }

    private static void cambiarValor(int[] edadArray) {
        System.out.println("iniciamos el metodo cambiarValor");
        for (int i = 0; i < edadArray.length; i++) {
            edadArray[i] = edadArray[i] + 20;
        }
        System.out.println("Finaliza el metodo cambiarValor");
    }
}
