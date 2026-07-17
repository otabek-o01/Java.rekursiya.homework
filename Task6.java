import java.util.Scanner;

public class Task6 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter Number :  ");
        int son, kvad;
        son = sc.nextInt();


        System.out.print(" Kvadratini kirigizing : ");
        kvad = sc.nextInt();

        System.out.println("Natija = " + terminal(kvad, son));

    }

    public static int terminal(int kvad, int son){
        int natija = kvad * son;
        return natija;
    }
}
