package clases;

import java.util.Scanner;

public class OperadoresLogicosLogin  {

    public static void main(String[] args) {

//        String[] usernames = new String[2];
//        String[] passwords = new String[2];
//        usernames[0] = "samuel";
//        passwords[0] = "123123";
//
//        usernames[1] = "admin";
//        passwords[1] = "123123";

        String[] usernames = {"samuel", "admin", "daniela"};
        String[] passwords = { "123", "12312", "123123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar el username: ");
        String u = scanner.next();

        System.out.println("Ingresar la contrasena: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = usernames[i].equals(u) && passwords[i].equals(p) ? true : esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido usuario: ".concat(u) : "Username o contrasena incorrectos \n Lo siento requiere autenticacion";
        System.out.println( mensaje );
    }

}
