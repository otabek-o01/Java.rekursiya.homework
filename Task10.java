import java.util.Scanner;

public class Task10 {

    static double kvad (int a){
        double a2 = a * a;
        double a3 =  a2 * a;
        double a4 = a2 * a2;
        double a5 = a4 * a3;
        return a5;
    }
    public static void main(String[] args){

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Number ");
        int a ;
        a = sc.nextInt();
        System.out.println("Natija = "+kvad(a));
    }
}
