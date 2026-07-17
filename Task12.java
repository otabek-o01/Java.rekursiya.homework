import java.util.Scanner;

public class Task12 {
    static int num ( int num2){
        int natija = (num2 / 1000)% 10;
        return natija;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num2;
        num2 = sc.nextInt();
        System.out.println(" Enter Number ");

        System.out.println("Naijta = "+ num(num2));
    }
}
