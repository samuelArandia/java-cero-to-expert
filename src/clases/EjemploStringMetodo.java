package clases;

public class EjemploStringMetodo {

    public static void main(String[] args) {
        String nombre = "Samuel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre = " + nombre.equals("samueL"));
        System.out.println("nombre.equalsIgnoreCase(\"SamueL\") = " + nombre.equalsIgnoreCase("SamueL"));
        System.out.println("nombre.compareTo(\"Samuel\") = " + nombre.compareTo("Samuel"));
        System.out.println("nombre.compareTo(\"Lorenzo\") = " + nombre.compareTo("Lorenzo"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        
        
        String hipotalamo = "hipotalamo";

        System.out.println("hipotalamo.replace(\"a\",\".\") = " + hipotalamo.replace("a","."));
        System.out.println("hipotalamo = " + hipotalamo);
        System.out.println("hipotalamo.indexOf(\"a\") = " + hipotalamo.indexOf("a"));
        System.out.println("hipotalamo.lastIndexOf('a') = " + hipotalamo.lastIndexOf('a'));
        System.out.println("hipotalamo.contains(\"m\") = " + hipotalamo.contains("m"));
        System.out.println("hipotalamo.startsWith(\"hipo\") = " + hipotalamo.startsWith("hipo"));
        System.out.println("hipotalamo.endsWith(\"lamo\") = " + hipotalamo.endsWith("lamo"));

        System.out.println("   hipotalamo   " );
        System.out.println("hipotalamo.trim() = " + hipotalamo.trim());
        
    }
    
}
