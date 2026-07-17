import java.util.Scanner;

public class Task9 {

    static int rekursiya(int son) {

        if (son < 1000 || son > 100000) {
            return -1; // noto'g'ri son
        }

        int son2 = (son / 10) % 10;
        return son2;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number  = ");
        int son;
        son = sc.nextInt();

        System.out.println("Natija " + rekursiya(son));

    }
}
