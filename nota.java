import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.print("Digite uma nota (0 a 10): ");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido!");
            System.out.print("Digite novamente: ");
            nota = sc.nextDouble();
        }

        System.out.println("Nota válida: " + nota);
    }
}