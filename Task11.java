import java.util.Scanner;

public class Task11 {


    static double Metr (int L){
        return L / 100.0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Number = ");

        int L ;
        L = sc.nextInt();

        System.out.println("Natija = " +Metr(L));
    }
}
