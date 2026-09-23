package week5;
import java.util.Scanner;

public class PemilihanIfElseNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Masukkan semester saat ini : ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Anda berada di semester 1");
        } else if (semester == 2) {
            System.out.println("Anda berada di semester 2");
        } else if (semester == 3) {
            System.out.println("Anda berada di semester 3");
        } else if (semester == 4) {
            System.out.println("Anda berada di semester 4");
        } else if (semester == 5) {
            System.out.println("Anda berada di semester 5");
        } else if (semester == 6) {
            System.out.println("Anda berada di semester 6");
        } else if (semester == 7) {
            System.out.println("Anda berada di semester 7");
        } else if (semester == 8) {
            System.out.println("Anda berada di semester 8");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}