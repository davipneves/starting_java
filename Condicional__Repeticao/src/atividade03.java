
import java.util.Scanner;
public class atividade03 {
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        int idade;String nome;int salario;char sexo;char estadoCivil;

        do{
            System.out.println("Digite um nome com mais de 3 caracteres");
            nome = scanf.next();
        }while(nome.length()<3);

        do{
            System.out.println("Digite a sua idade");
            idade = scanf.nextInt();
        }while(idade<=0 || idade>=150);
        do {
            System.out.println("Digite o seu salário");
            salario = scanf.nextInt();
        }while (salario<=0);
        do{
            System.out.println("Informe o seu sexo, 'm' paras masculino e 'f' para feminino");
            sexo = scanf.next().charAt(0);
        }while (sexo != 'm' && sexo != 'f' );
        do {
            System.out.println("Infome o seu estado");
            estadoCivil = scanf.next().charAt(0);
        }while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'd' && estadoCivil != 'v');

        System.out.println("Cadastro realizado com sucesso");
    }
}
