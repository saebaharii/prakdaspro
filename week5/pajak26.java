package week5;
import java.util.Scanner;

public class pajak26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Perhitungan PPh 21 Tahunan ----");
        System.out.print("Masukkan Penghasilan Kena Pajak (PKP): Rp ");
        double pkp = sc.nextDouble();
        double pajak;
        if (pkp <= 0) {
            pajak = 0;
        } else if (pkp <= 60000000) {
            pajak = pkp * 0.05;
        } else if (pkp <= 250000000) {
            pajak = (60000000 * 0.05) + ((pkp - 60000000) * 0.15);
        } else if (pkp <= 500000000) {
            pajak = (60000000 * 0.05) + (190000000 * 0.15) + ((pkp - 250000000) * 0.25);
        } else {
            pajak = (60000000 * 0.05) + (190000000 * 0.15) + (250000000 * 0.25) + ((pkp - 500000000) * 0.30);
        }
        System.out.printf("PPh 21 tahunan: Rp %.0f%n", pajak);
        sc.close();
    }
}