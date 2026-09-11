package week2;
import java.util.Scanner;

public class studiKasus1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        int gajiPokok = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = sc.nextInt();

        int tunjangan = jumlahAnak * 100000;
        int danaPensiun = gajiPokok * 10 / 100;
        int gajiBersih = gajiPokok + tunjangan - danaPensiun;

        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Potongan Dana Pensiun 10%: " + danaPensiun);
        System.out.println("Gaji Bersih: " + gajiBersih);
    }
}
