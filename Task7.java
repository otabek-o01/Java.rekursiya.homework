import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("So'm kiriting: ");
        int som = sc.nextInt();

        System.out.println("Dollar: " + doll2(som));
    }

    public static double doll2(int som) {
        double dollar = som / 11200;
        return dollar;
    }
}