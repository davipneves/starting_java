

public class atividade04 {
    public static void main(String[] args) {
        int i=0;

        double paisA = 80000 , paisB = 200000;

        while(paisB>=paisA){
            paisA = paisA + (paisA* (3.0/100));
            paisB = paisB + (paisB*(1.5/100));
            i++;
        }
        System.out.println("Serão necesessário " +i+ " anos");

    }
}
