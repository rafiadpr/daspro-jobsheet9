import java.util.Scanner;

public class SearchNilai23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah elemen array
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = input.nextInt();
        
        // Deklarasi array sesuai dengan input jumlah elemen
        int[] arrayNilai = new int[jumlahNilai];

        // Meminta input nilai untuk setiap elemen array
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrayNilai[i] = input.nextInt();
        }

        // Meminta input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = input.nextInt();

        // Mencari nilai dalam array
        int posisi = -1;
        
        for (int i = 0; i < arrayNilai.length; i++) {
            if (arrayNilai[i] == key) {
                posisi = i + 1;  // Menyimpan posisi yang ditemukan (1-based index)
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (posisi != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + posisi);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
