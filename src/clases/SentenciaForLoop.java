package clases;

public class SentenciaForLoop {

    public static void main(String[] args) {
        int term=6;

        for(int i=1;i<=term;i++){
            for(int j=term; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }

        for ( int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        for ( int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        for ( int i = 1, j = 10; i < j; i++, j-- ){
            System.out.println(i  + " - " +j);
        }

        for ( int i = 0; i <= 10; i++) {
            if ( i % 2 == 0 ) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
