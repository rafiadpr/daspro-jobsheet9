import java.util.Scanner;

public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = input.nextInt();
        int[] nilai = new int[jumlahNilai];
        int total = 0;

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int n : nilai) {
            if (n > nilaiTertinggi) nilaiTertinggi = n;
            if (n < nilaiTerendah) nilaiTerendah = n;
        }

        double rataRata = (double) total / jumlahNilai;
        
        System.out.println("Nilai yang dimasukkan: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }

        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}
