import java.util.Scanner;

public class Rekursiya{

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //  foydalanuvchi tarafdan kritiliyapti

        System.out.print(" Enter Number :  ");

        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int natija = a + b + c;
        System.out.println("Natija  = "+ fib(natija));
    }

    public static int fib(int natija ){
        return natija / 3;
    }
}