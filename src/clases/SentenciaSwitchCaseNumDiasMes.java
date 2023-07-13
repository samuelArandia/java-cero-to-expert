package clases;

import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes de 1 a 12 ");
        int mes = scanner.nextInt();
        int numeroDias = 0;

        System.out.println("Ingrese el ano(yyyy)");
        int anio = scanner.nextInt();


        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                    numeroDias = 28;
                } else {
                    numeroDias = 29;
                }
                break;
            default:
                numeroDias = 0;

        }

//        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) {
//            numeroDias = 31;
//        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//            numeroDias = 30;
//        } else if (mes == 2) {
//            if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
//                numeroDias = 28;
//            } else{
//                numeroDias = 29;
//            }
//        }
        System.out.println("numeroDias = " + numeroDias);
    }
}
