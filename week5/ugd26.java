package week5;
import java.util.Scanner;

public class ugd26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Sistem Penentu Ruang Perawatan UGD ----");
        System.out.print("Masukkan saturasi oksigen (SpO2): ");
        int spo2 = sc.nextInt();
        System.out.print("Masukkan sisa bed ICU: ");
        int sisaBedICU = sc.nextInt();
        System.out.print("Masukkan tekanan darah sistolik (mmHg): ");
        int tekananSistolik = sc.nextInt();
        System.out.print("Pasien sadar penuh? (true/false): ");
        boolean sadarPenuh = sc.nextBoolean();
        System.out.print("Masukkan suhu tubuh (C): ");
        double suhuTubuh = sc.nextDouble();
        System.out.print("Memiliki riwayat komorbid? (true/false): ");
        boolean memilikiKomorbid = sc.nextBoolean();
        System.out.print("Masukkan usia pasien: ");
        int usia = sc.nextInt();
        System.out.print("Masukkan laju napas (x/menit): ");
        int lajuNapas = sc.nextInt();

        String lokasiPerawatan;
        if (spo2 < 85 && sisaBedICU > 0) {
            lokasiPerawatan = "ICU";
        } else if (spo2 < 85 && sisaBedICU == 0) {
            lokasiPerawatan = "UGD_VENTILATOR_MOBIL";
        } else if ((spo2 >= 85 && spo2 <= 89) || tekananSistolik < 90 || tekananSistolik > 180 || !sadarPenuh) {
            lokasiPerawatan = "RESUSITASI_UGD";
        } else if (((spo2 >= 90 && spo2 <= 94) || suhuTubuh > 39) && memilikiKomorbid && usia >= 65) {
            lokasiPerawatan = "HCU_ISOLASI";
        } else if ((spo2 >= 90 && spo2 <= 94) || lajuNapas > 24) {
            lokasiPerawatan = "RAWAT_INAP_UMUM";
        } else {
            lokasiPerawatan = "RAWAT_JALAN";
        }

        System.out.println("Lokasi perawatan: " + lokasiPerawatan);
        sc.close();
    }
}