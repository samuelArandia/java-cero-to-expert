package automovil;

public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor("Azul");

        Automovil mazda = new Automovil("Mazda", "BT-50");
        mazda.setColor("Blanco");
        mazda.setCilindrada(2.0);

//        System.out.println("El fabricante del subaru es: " + subaru.leerFabricante());
//        System.out.println("El modelo del subaru es: " + subaru.leerModelo());
//        System.out.println("La cilindrada del subaru es: " + subaru.leerCilindrada());
//        System.out.println("El color del subaru es: " + subaru.leerColor());
//
//        System.out.println("El fabricante del mazda es: " + mazda.leerFabricante());
//        System.out.println("La cilindrada del mazda es: " + mazda.leerCilindrada());
//        System.out.println("El modelo del mazda es: " + mazda.leerModelo());
//        System.out.println("El color del mazda es: " + mazda.leerColor());

        System.out.println(mazda.verDetalle());
        System.out.println(subaru.verDetalle());

        System.out.println("El consumo del subaru es: " + subaru.calcularCosumo(300, 0.9f));
        System.out.println("El consumo del mazda es: " + mazda.calcularCosumo(300, 0.9f));



    }
}
