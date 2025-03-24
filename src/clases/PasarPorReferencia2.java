package clases;

class Persona {
    private String nombre;
    private String apellido;

    public void modificarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public String obtenerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Samuel");
        System.out.println("persona = " + persona.obtenerNombre());
        System.out.println("iniciamos el metodo main");
        System.out.println("Antes de llamar al metodo cambiarValor");
        cambiarValor(persona);
        System.out.println("Despues de llamar al metodo cambiarValor");
        System.out.println("persona = " + persona.obtenerNombre());
        System.out.println("Finaliza el metodo main");
    }

    private static void cambiarValor(Persona persona) {
        System.out.println("iniciamos el metodo cambiarValor");
        persona.modificarNombre("Daniela");
        System.out.println("Finaliza el metodo cambiarValor");
    }
}
