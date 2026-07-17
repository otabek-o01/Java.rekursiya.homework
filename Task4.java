import java.util.Scanner;

public class Task4 {

    static int num (int A){
        if (A == 0) return 0;
        return (A * A * A * A);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" A =  ");
        int A ;

        A = sc.nextInt();

        System.out.println(" Natija V = "+num(A));
        System.out.println(" Natija S = "+natija1(A));
    }
    public static int natija1 (int A){
        int S = 6;
        int natija  = S*(A * A);
        return natija;
    }

}
