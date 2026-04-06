public class populacao {
    public static void main(String[] args) {

        int anos = 0;
        double A = 80000;
        double B = 200000;

        while (A < B) {
            A = A + (A * 0.03);
            B = B + (B * 0.015);
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
    }
}