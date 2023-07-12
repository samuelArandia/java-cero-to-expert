package clases;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();
        
        for ( int i = 0; i < 500; i++) {
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
//            c = c + a + b + "\n"; // 500 => 12ms
//            c += a + b + "\n";// 500 => 14ms
            sb.append(a)
                    .append(b)
                    .append("\n");// 500 => 1ms 
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
        System.out.println("Esto es el sb sb.toString() = " + sb.toString());
    }
}
