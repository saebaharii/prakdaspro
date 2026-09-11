package week2;
import java.util.Scanner;
public class segitigaFira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan alas segitiga: ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2.0f;

        System.out.println("Luas segitiga adalah: " + luas);
        
    }
}
