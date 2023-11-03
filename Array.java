//Number4//
//Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for//
public class Array {
    public static void main(String[] args) {
        // Membuat sebuah array dengan tipe data int
        int[] numbers = {7, 9, 15, 20, 22, 26};

        // Menampilkan semua nilai dalam array menggunakan perulangan for
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nilai ke-" + i + ": " + numbers[i]);
        }
    }
}