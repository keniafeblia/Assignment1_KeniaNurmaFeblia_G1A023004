//Number2//
//Buatlah program bebas, dengan menerapkan if else dalam perulangan while//
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Masukkan sebuah angka: ");
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            if (num > 0) {
                System.out.println(num + " adalah positif");
            } else if (num < 0) {
                System.out.println(num + " adalah negatif");
            } else {
                System.out.println(num + " adalah nol");
            }
        }
    }
}