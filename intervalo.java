import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}