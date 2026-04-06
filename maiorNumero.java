import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            num = sc.nextInt();

            if (num > maior) {
                maior = num;
            }
        }

        System.out.println("Maior número: " + maior);

        sc.close();
    }
}