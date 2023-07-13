package clases;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"samuel", "daniela", "Moises", "maria","Lorenzo"};
        int count = nombres.length;

        for ( int i = 0; i < count ; i++) {
            if (nombres[i].toLowerCase().contains("moises".toLowerCase())
                    || nombres[i].equalsIgnoreCase("lorenzo")) {
                continue;
            }
            System.out.println(i + 1 + ".-Nombre = " + nombres[i] );
        }

        String buscarNombre = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"fulano\" o \"Mengano\":");
        System.out.println("buscarNombre = " + buscarNombre);

        boolean encontrado = false;
        for ( int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscarNombre)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres[i] = " + nombres[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscarNombre + "\n Encontrado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, buscarNombre + "\n No fue encontrador en el sistema");
        }
    }
}
