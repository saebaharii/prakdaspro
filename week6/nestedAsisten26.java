package week6;
import java.util.Scanner;
public class nestedAsisten26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah status mahasiswa aktif? (true/false):");
        boolean status = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false):");
        boolean sanksi = sc.nextBoolean();

        if (status && !sanksi){
            System.out.println("Anda Dapat Mengikuti Seleksi !");
            System.out.print("Masukkan nilai dasar pemograman :");
            int nilaiDaspro = sc.nextInt();
            System.out.print("Apakah mahasiswa memiliki sertifikat kompetisi (true/false):");
            boolean sertifYes = sc.nextBoolean();
                if (nilaiDaspro >= 80 || sertifYes){
                    System.out.println("Anda Lanjut Ke Proses Wawancara !");
                    System.out.print("Masukkan nilai wawancara :");
                    int nilaiWawancara = sc.nextInt();
                        if (nilaiWawancara >= 75){
                            System.out.println("Anda diterima sebagai asisten!");
                        } else {
                            System.out.println("Anda gagal di tahap wawancara, nilai dibawah 75");
                        }
                }else{
                    System.out.println("Anda gagal di tahap nilai/sertifikat");
                }
            }else{
                System.out.println("Anda gagal di tahap seleksi status/sanksi akademik");
            }
            sc.close();
    }
}
