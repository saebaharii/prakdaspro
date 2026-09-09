package week3;
import java.util.Scanner;
public class studiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahCetak;
        int hargaCetak = 500;
        int jilid = 5000;
        int totalBayar;

        System.out.print("Masukkan jumlah lembar : ");
        jumlahCetak = sc.nextInt();
        totalBayar = jumlahCetak * hargaCetak + jilid;
        System.out.println("Harga jilid buku : " + jilid);
        System.out.println("Total yang harus dibayar adalah : " + totalBayar);
    }
    
}
