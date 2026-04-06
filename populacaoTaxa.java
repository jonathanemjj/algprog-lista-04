import java.util.Scanner;

public class populacaoTaxa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            double A, B, taxaA, taxaB;
            int anos = 0;

            // 👉 Validação das populações
            do {
                System.out.print("População A: ");
                A = sc.nextDouble();
                if (A <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (A <= 0);

            do {
                System.out.print("População B: ");
                B = sc.nextDouble();
                if (B <= 0) {
                    System.out.println("Valor inválido!");
                }
            } while (B <= 0);

            // 👉 Taxas
            System.out.print("Taxa de crescimento A (%): ");
            taxaA = sc.nextDouble() / 100;

            System.out.print("Taxa de crescimento B (%): ");
            taxaB = sc.nextDouble() / 100;

            // 👉 MESMA lógica do exercício 4
            while (A < B) {
                A += A * taxaA;
                B += B * taxaB;
                anos++;
            }

            System.out.println("Anos necessários: " + anos);

            // 👉 Permitir repetir
            System.out.print("Deseja repetir? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');

        sc.close();
    }
}