package clases;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFact = null;
        Double priceProductOne = null;
        Double priceProductTwo = null;
        Double impuesto = null;
        double subTotal;
        double total;

        if ( nameFact == null ) {
            try {
                System.out.println("Ingrese el nombre de la factura: ");
                nameFact = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Debe ingresar el nombre de la factura");
            }
        }
        if ( priceProductOne == null && priceProductTwo == null ) {
            try {
                System.out.println("Ingrese el precio del producto 1: ");
                priceProductOne = scanner.nextDouble();
                System.out.println("Ingrese el precio del producto 2: ");
                priceProductTwo = scanner.nextDouble();
            } catch (Exception e ) {
                System.out.println("Debe ingresar los precios");
            }
        }

        if ( nameFact != null && priceProductOne !=null && priceProductTwo != null ) {
            subTotal = priceProductOne + priceProductTwo;
            impuesto = subTotal * 0.19;
            total = subTotal + impuesto;
            System.out.println(
                    "Nombre de la Factura: " + nameFact.toUpperCase()+
                    "\nSub-Total: " + subTotal +
                    "\nImpuesto: " + impuesto + "\nTotal: " + total
            );
        }

    }
}
