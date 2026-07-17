import java.util.Scanner;

public class Task3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" A =");
        int A;

        System.out.println(" B = ");
        int B;

        A = sc.nextInt();
        B = sc.nextInt();

        System.out.println(" To'g'ri To'rtburchak yuzasai : "+ Yuz(A, B));
        System.out.println(" To'g'ri To'rtburchakni Perimetr " + Perimetr(A , B));
    }

    public static int Perimetr (int A , int B){
        int natija  = A * B;
        return  natija;
    }

    public static int Yuz (int A, int B){
        int P  = 2;
        int Natija2 = P * (A + B);
        return  Natija2;
    }
}
