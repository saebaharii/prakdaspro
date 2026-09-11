package week2;
import java.util.Scanner;

public class studiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//input nilai awal
        System.out.print("Masukkan lebar tanah (meter): ");
        int lebarTanah = sc.nextInt();
        System.out.print("Masukkan panjang tanah (meter): ");
        int panjangTanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam (meter): ");
        int diameter = sc.nextInt();
        System.out.print("Masukkan sisi taman bunga (meter): ");
        int sisiTaman = sc.nextInt();
//perhitungan
        int luasTanah = lebarTanah * panjangTanah;
        double jariJari = diameter / 2.0;
        double luasKolam = Math.PI * jariJari * jariJari;
        int luasTaman = sisiTaman * sisiTaman;
        double luasTanahSisa = luasTanah - luasKolam - luasTaman;
//output
        System.out.println("Luas tanah: " + luasTanah + " meter persegi");
        System.out.println(String.format("Luas kolam: %.2f meter persegi", luasKolam));
        System.out.println("Luas taman: " + luasTaman + " meter persegi");
        System.out.println(String.format("Luas tanah yang tidak digunakan: %.2f meter persegi", luasTanahSisa));
    }
}
