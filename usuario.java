import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        System.out.print("Usuário: ");
        usuario = sc.nextLine();

        System.out.print("Senha: ");
        senha = sc.nextLine();

        while (senha.equals(usuario)) {
            System.out.println("Erro! A senha não pode ser igual ao usuário.");
            
            System.out.print("Digite o usuário novamente: ");
            usuario = sc.nextLine();

            System.out.print("Digite a senha novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Cadastro realizado!");

        sc.close();

    }
   

}