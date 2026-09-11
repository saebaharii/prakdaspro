package week2;
import java.util.Scanner;

public class bankFira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        System.out.print("Masukkan jumlah tabungan awal: ");
        jml_tabungan_awal = sc.nextInt();
        System.out.print("Masukkan lama menabung (dalam bulan): ");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung * prosentase_bunga * jml_tabungan_awal;
        jml_tabungan_akhir = jml_tabungan_awal + bunga;

        System.out.println("Bunga adalah: " + bunga);
        System.out.println("Jumlah tabungan akhir: " + jml_tabungan_akhir);
    }
}
