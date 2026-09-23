package week5;
import java.util.Scanner;
public class tugasParkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Perhitungan Tarif Parkir Mall ----");
        System.out.print("Masukkan lama parkir (jam): ");
        int jam = sc.nextInt();
        int tarif;

        if (jam <= 2) { //jika jam kurang dari samadengan 2 maka tarif = 2000
            tarif = 2000;
        } else {
            tarif = 2000 + (jam - 2) * 1000; //jika lebih dari 2 jam maka tarif = 2000 + (totaljam - 2) * 1000
        }
        System.out.println("Total tarif parkir: Rp " + tarif);
    }
}