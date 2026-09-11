package week3;
import java.util.Scanner;
public class studiKasus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaLaptop;
        int uangMuka;
        double bunga = 0.02;
        double cicilan;
        int lamaCicilan;

        System.out.print("Masukkan harga laptop : ");
        hargaLaptop = sc.nextInt();
        System.out.print("Masukkan uang muka : ");
        uangMuka = sc.nextInt();
        System.out.print("Masukkan lama cicilan (dalam bulan) : ");
        lamaCicilan = sc.nextInt();

        int sisahHarga = hargaLaptop - uangMuka;
        double totalBunga = sisahHarga * bunga;
        cicilan = (sisahHarga + totalBunga) / lamaCicilan;

        System.out.println("Jumlah cicilan per bulan adalah : " + cicilan);
        System.out.println("Total yang harus dibayar adalah : " + (cicilan * lamaCicilan));
    }
}
