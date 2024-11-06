import java.util.Scanner;

public class ArrayRataNilai23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Deklarasi array dengan ukuran sesuai input pengguna
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int countLulus = 0, countTidakLulus = 0;

        // Meminta input nilai untuk setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();

            // Menghitung total dan jumlah mahasiswa lulus atau tidak lulus
            if (nilaiMahasiswa[i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                countLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                countTidakLulus++;
            }
        }

        // Menghitung rata-rata lulus dan tidak lulus
        double rataRataLulus = (countLulus > 0) ? (totalLulus / countLulus) : 0;
        double rataRataTidakLulus = (countTidakLulus > 0) ? (totalTidakLulus / countTidakLulus) : 0;

        // Menampilkan rata-rata lulus dan tidak lulus
        System.out.println("Rata-rata nilai mahasiswa yang lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus = " + rataRataTidakLulus);
    }
}
