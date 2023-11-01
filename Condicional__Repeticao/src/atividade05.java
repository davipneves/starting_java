import java.util.Scanner;

public class atividade05 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int i=0;
        String esc;

        do {
            System.out.println("Informe a população atual da pais A");
            double paisA = scanf.nextDouble();
            System.out.println("Infome a taxa de crescimento do país A");
            double taxaCrescimentoA  = scanf.nextDouble();
            System.out.println("Informe a população atual do pais B");
            double paisB = scanf.nextDouble();
            System.out.println("Informe a taxa de crescimento do país B");
            double taxaCrescimentoB = scanf.nextDouble();

            while(paisB>=paisA){
                paisA = paisA + (paisA*(taxaCrescimentoA/100));
                paisB = paisB + (paisB*(taxaCrescimentoB/100));

                i++;
            }

            System.out.println("Será necessário "+i+" anos");
            System.out.println("Deseja repetir a operação? digite 's' para repetir");
            esc = scanf.next();

        }while(esc.equals("s"));


    }
}
