import java.util.Scanner;

public class Task8 {

    static int num2(int num){
        int natija = num / 1000;
        return natija;
    }
    static int num4(int num2, int num3){
        int natija3 = num2 * num3;
        return natija3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Number =");
        int num;
        num = sc.nextInt();

        System.out.println("O'nlar va minglar xonasidagi ko'paytma natijasi = " + num4(num2(num), num3(num)));
    }
    public static int num3(int num){
        int natija2 = (num / 10) % 10;
        return natija2;
    }

}
