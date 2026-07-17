import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("A = ");
        int A = sc.nextInt();

        System.out.print("B = ");
        int B = sc.nextInt();

        System.out.print("C = ");
        int C = sc.nextInt();

        temp(A, B, C);
    }

    public static void temp(int A, int B, int C) {
        int temp = A;
        A = B;
        B = C;
        C = temp;

        System.out.println("Yangi A = " + A);
        System.out.println("Yangi B = " + B);
        System.out.println("Yangi C = " + C);
    }
}