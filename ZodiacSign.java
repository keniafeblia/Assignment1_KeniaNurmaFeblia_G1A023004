//Number3//
//Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan//
import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int tanggal, bulan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Lahir Anda (1-31): ");
        tanggal = sc.nextInt();
        System.out.println("Masukkan Bulan Lahir Anda (1-12): ");
        bulan = sc.nextInt();
        String sign = getZodiacSign(tanggal, bulan);
        System.out.println("Zodiac Anda Adalah: " + sign);
    }

    public static String getZodiacSign(int tanggal, int bulan) {
        String sign = "";
        switch (bulan) {
            case 1:
                if (tanggal <= 19) {
                    sign = "Capricorn";
                } else {
                    sign = "Aquarius";
                }
                break;
            case 2:
                if (tanggal <= 18) {
                    sign = "Aquarius";
                } else {
                    sign = "Pisces";
                }
                break;
            case 3:
                if (tanggal <= 20) {
                    sign = "Pisces";
                } else {
                    sign = "Aries";
                }
                break;
            case 4:
                if (tanggal <= 19) {
                    sign = "Aries";
                } else {
                    sign = "Taurus";
                }
                break;
            case 5:
                if (tanggal <= 20) {
                    sign = "Taurus";
                } else {
                    sign = "Gemini";
                }
                break;
            case 6:
                if (tanggal <= 20) {
                    sign = "Gemini";
                } else {
                    sign = "Cancer";
                }
                break;
            case 7:
                if (tanggal <= 22) {
                    sign = "Cancer";
                } else {
                    sign = "Leo";
                }
                break;
            case 8:
                if (tanggal <= 22) {
                    sign = "Leo";
                } else {
                    sign = "Virgo";
                }
                break;
            case 9:
                if (tanggal <= 22) {
                    sign = "Virgo";
                } else {
                    sign = "Libra";
                }
                break;
            case 10:
                if (tanggal <= 22) {
                    sign = "Libra";
                } else {
                    sign = "Scorpio";
                }
                break;
            case 11:
                if (tanggal <= 21) {
                    sign = "Scorpio";
                } else {
                    sign = "Sagittarius";
                }
                break;
            case 12:
                if (tanggal <= 21) {
                    sign = "Sagittarius";
                } else {
                    sign = "Capricorn";
                }
                break;
            default:
                sign = "Tidak Diketahui";
                break;
        }
        return sign;
    }
}