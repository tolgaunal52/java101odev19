import java.util.Scanner;

public class odev19 {
    public static void main(String[] args) {
        int a,i,k;

        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz : ");
        a = input.nextInt();
        System.out.println("\n4'un Katlari");
        for (i=1; i<=a; i*=4){
            System.out.println(i);
        }
        System.out.println("\n5'i Katlari");
        for (k=1; k<=a; k*=5){
            System.out.println(k);
        }
    }
}
