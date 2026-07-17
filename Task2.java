import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A Permetr kiriting :");

        int A;

        A = sc.nextInt();

        System.out.print(" Perimetr natija =  "+ Per(A));
    }
    public static int Per(int A){
        int P =4;
        return A * P;
    }
}
