import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite o  nome do usuário");
        String nomeUsuario = scanf.next();
        System.out.println("Digite a senha para o usuário");
        String senhaUsuario = scanf.next();

        if(nomeUsuario.equals(senhaUsuario)){
            do {
                System.out.println("Senha inválida, insira uma senha diferente do nome de usuário");
                senhaUsuario = scanf.next();
            }while(nomeUsuario.equals(senhaUsuario));
        }
        System.out.println("Cadastro relizado com sucesso");
    }
}
