package clases;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 5;
        int b = 5 + a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += 2;// a = a + 2
        System.out.println("a = " + a);

        a -= 5; // a = a -5
        System.out.println("a = " + a);

        a *= 4; a = a * 4;
        System.out.println("a = " + a);


        String sqlString = "select * from clientes as c";
        sqlString += "where c.nombre= 'samuel'";
        sqlString += "and c.activo=1";

        System.out.println("sqlString = " + sqlString);

    }
}
