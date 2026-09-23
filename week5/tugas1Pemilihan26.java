package week5;
import java.util.Scanner;
public class tugas1Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
            ? "Pembayaran UKT berhasil terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.";
            
        System.out.println(pesan);
    }
}
