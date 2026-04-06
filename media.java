import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            soma += num;
        }

        double media = soma / 5.0;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        sc.close();
    }
}