package week6;
import java.util.Scanner;

public class sourceStudi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDasarPemrograman = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            if (nilaiDasarPemrograman >= 80 || punyaSertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal pada tahap wawancara: nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal pada tahap nilai/sertifikat: nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat");
            }
        } else {
            System.out.println("Gagal pada tahap status: mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik");
        }

        sc.close();
    }
}
