package week5;
import java.util.Scanner;
public class tugas2Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cek Jumlah KRS SIAKAD ----");
        System.out.print("Masukkan Jumlah SKS semester saat ini : ");
        int sks = sc.nextInt();

        if (sks > 24) {
            System.out.println("Jumlah SKS melebihi batas.");
        } else {
            System.out.println("Jumlah SKS Valid.");
        }
    }
}
