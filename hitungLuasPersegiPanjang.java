package week3;
import java.util.Scanner;
public class hitungLuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = sc.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi adalah " + luas);
    }
}
