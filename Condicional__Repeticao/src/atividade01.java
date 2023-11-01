import java.util.Scanner;

 class atividade01{
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite uma nota entre 0 e 10");

        int nota = scanf.nextInt();

       while(nota>0 && nota<10){
           System.out.println("Digite uma nova nota");
           nota = scanf.nextInt();
       }
        System.out.println("Nota inválida");


    }
}

