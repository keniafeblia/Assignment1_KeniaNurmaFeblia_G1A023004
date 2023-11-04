# Assignment1_KeniaNurmaFeblia_G1A023004

### Latar Belakang 
Pesatnya perkembangan teknologi membuat makin banyak pula aplikasi atau program yang digunakan untuk membantu masyarakat. Bukan hanya aplikasi produktif saja, aplikasi hiburan seperti Games juga terus bertumbuhan. Semua aplikasi atau program tersebut dibuat dan dikembangkan menggunakan bahasa pemrograman yang berbeda. Meskipun menggunakan beragam bahasa yang berbeda, namun cara berpikir atau algoritmanya akan tetap sama.
Sementara itu, pemrograman adalah proses mengembangkan program, perangkat lunak komputer, aplikasi, dan situs web (Tim Kemdikbud, 2021, hlm. 195). Saat ini, komputer tidak dapat berpikir sendiri. Komputer hanya menjalankan perintah yang diberikan kepadanya atau yang sudah tersimpan dan siap dijalankan. Komputer meminta pengguna untuk memberi serangkaian instruksi yang diperintahkan untuk mengetahui apa yang harus dilakukan. Perintah yang dipahami oleh komputer disebut sebagai “kode”, oleh karena itu terkadang pemrograman juga disebut dengan coding (mengode).

### Rumusan masalah 
1.	Bagaimana cara menerapkan if, else, dan array ?
2.	Kendala apa yang di dapat saat melakukan pemrograman menggunakan aplikasi ?

### Tujuan 
1.	Untuk mengetahui bagaimana cara menggunakan if, else, dan array.
2.	Untuk mengetahui kendala apakah yang sering dihadapi saat melakukan pemrograman menggunakan aplikasi.

### Manfaat
1.	Mengetahui penggunaan if, else, dan array.
2.	Mengetahui aplikasi yang cocok dengan pengguna.

### Soal dan Pembahasan
1. Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
Kode:
public class Pengulangan {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i <= 9) {
                System.out.println(i);
            } else {
                System.out.println("Kenia");


            }

        }

    }
}
penjelasan kode:
1.	public class Pengulangan {: Mendefinisikan kelas Pengulangan yang dapat diakses oleh kelas lain.
2.	public static void main(String[] args){: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
3.	for(int i = 1; i<=100; i++){: Memulai perulangan dari 1 hingga 100.
4.	if (i<=9){: Jika nilai i lebih kecil atau sama dengan 9, maka jalankan baris kode berikutnya.
5.	System.out.println(i);: Menampilkan nilai variabel i.
6.	} else {: Jika nilai i lebih dari 9, maka jalankan baris kode berikutnya.
7.	System.out.println(“Kenia”);: Menampilkan nilai Nama.
8.	}: Menutup blok if-else.
9.	}: Menutup blok perulangan for.
    
2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while.
Kode:
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
Penjelasan kode:
1.	import java.util.Scanner;: Mendeklarasikan package java.util.Scanner yang digunakan untuk membaca input dari pengguna.
2.	public class PositiveNegativeZero {: Mendefinisikan kelas PositiveNegativeZero yang dapat diakses oleh kelas lain.
3.	public static void main(String[] args) {: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan. 
4.	int num;: Setelah deklarasi int num;, variabel num telah dideklarasikan dan dapat digunakan dalam program Anda untuk menyimpan nilai bilangan bulat. 
5.	Scanner sc = new Scanner(System.in);: Membuat objek sc dari kelas Scanner untuk membaca input dari pengguna. 
6.	while (true) {: Memulai perulangan tak terbatas.
7.	System.out.println("Masukkan sebuah angka:”);: Menampilkan teks "Masukkan sebuah angka:".
8.	num = sc.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel num.
9.	if (num == 0) {: jika nilai dari variabel num sama dengan 0, maka pernyataan break akan menghentikan eksekusi perulangan atau blok kode di mana if ini terletak.
10.	break;: Keluar dari perulangan.
11.	}: Menutup blok if.
12.	if (num > 0) {: Jika nilai num lebih besar dari 0, maka jalankan baris kode berikutnya.
13.	System.out.println(num + " adalah positif");: Akan menampilkan teks “adalah positif” jika num bernilai lebih dari 0.
14.	} else if (num < 0) {: Jika num bernilai kurang dari 0 maka jalankan baris kode berikutnya.
15.	System.out.println(num + " adalah negatif");: Akan menampilkan teks “adalah negatif” jika num kurang dari 0.
16.	} else {: mengeksekusi kode yang berbeda jika kondisi dalam if tidak terpenuhi.
17.	System.out.println(num + " adalah nol");: Menampilkan teks "adalah nol:".
18.	}: Menutup blok if-else.
19.	}: Menutup blok perulangan while.


3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan.
Kode:
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
Penjelasan kode:
1.	import java.util.Scanner;: Mendeklarasikan package java.util.Scanner yang digunakan untuk membaca input dari pengguna.
2.	public class ZodiacSign {: Mendefinisikan kelas ZodiacSign yang dapat diakses oleh kelas lain.
3.	public static void main(String[] args) {: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
4.	Scanner sc = new Scanner(System.in);: Membuat objek sc dari kelas Scanner untuk membaca input dari pengguna.
5.	System.out.println("Masukkan Tanggal Lahir Anda (1-31): ”);: Menampilkan teks "Masukkan Tanggal Lahir Anda (1-31):”
6.	tanggal = sc.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel tanggal.
7.	System.out.println("Masukkan Bulan Lahir Anda (1-12): ");: Menampilkan teks "Masukkan Bulan Lahir Anda (1-12):".
8.	bulan = SC.nextInt();: Membaca input dari pengguna dan menyimpannya ke dalam variabel bulan.
9.	String sign = getZodiacSign(tanggal, bulan);: Menginisialisasi (membuat dan mengisi) variabel sign dengan nilai yang dihasilkan oleh pemanggilan fungsi atau metode getZodiacSign(tanggal, bulan).
10.	System.out.println("Zodiac Anda Adalah: " + sign);: Menampilkan teks “Zodiac Anda Adalah” dan juga variable sign
11.	String sign = "";: Mendefinisikan variabel sign dengan tipe data String dan memberikan nilai awal "".
12.	switch (bulan){: Memulai blok switch dengan variabel bulan sebagai kondisi.
13.	case 1:: Jika nilai bulan sama dengan 1, maka jalankan baris kode berikutnya.
14.	if (tanggal <= 19) {
                    sign = "Capricorn";
                } else {
                    sign = "Aquarius";
                }
: Jika nilai tanggal kurang dari atau sama dengan 19, maka nilai variabel zodiac adalah "capicorn". Jika tidak, maka nilai variabel zodiac adalah "aquarius".
15.	break;: Keluar dari blok switch.
16.	Dan seterusnya
    
4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for.
Ans:
public class Array {
    public static void main(String[] args) {
                int[] numbers = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

                for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nilai ke-" + i + ": " + numbers[i]);
        }
    }
}
Penjelasan kode:
1.	public class Array {: Mendefinisikan kelas Array yang dapat diakses oleh kelas lain.
2.	public static void main(String[] args){: Mendefinisikan metode main yang akan dieksekusi ketika program dijalankan.
3.	int[] numbers = { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };: Mendefinisikan array numbers dengan tipe data int dan memberikan nilai awal berupa bilangan bulat yang berurutan terbalik dari 15-1.
4.	for (int i=0; i< numbers.length; i++) {: Memulai perulangan dari 0 hingga panjang array numbers.
5.	System.out.println(“Nilai ke-“ + i + “: ” + numbers[i]);: Menampilkan nilai array numbers pada indeks ke-I dan teks “Nilai ke-:”
6.	}: Menutup blok perulangan for.

