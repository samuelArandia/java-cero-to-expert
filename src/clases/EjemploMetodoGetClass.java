package clases;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal";
        Class strClass = texto.getClass();

        System.out.println("texto.getClass() = " + strClass.getName());
        System.out.println("texto.getClass() = " + strClass.getSimpleName());
        System.out.println("texto.getClass() = " + strClass.getCanonicalName());
        System.out.println("texto.getClass() = " + strClass.getPackageName());
        System.out.println("texto.getClass() = " + strClass);

        for (Method method : strClass.getMethods()) {
            System.out.println("method.getName() = " + method.getName());
        }

        Integer num =34;
        Class intClass = num.getClass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("intClass = " + intClass.getSuperclass().getSuperclass());


    }
}
