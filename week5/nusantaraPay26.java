package week5;
import java.util.Scanner;

public class nusantaraPay26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Nusantara Pay ----");
        System.out.print("Masukkan status akun (ACTIVE/SUSPICIOUS/BLACK-LISTED): ");
        String statusAkun = sc.nextLine();
        System.out.print("Masukkan sisa saldo: $ ");
        double sisaSaldo = sc.nextDouble();
        System.out.print("Masukkan nominal transaksi: $ ");
        double nominalTransaksi = sc.nextDouble();
        System.out.println("Jumlah limit harian transaksi: $ 10000");
        System.out.print("Transaksi luar negeri? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();
        System.out.print("Masukkan jam transaksi (0-23): ");
        int jamTransaksi = sc.nextInt();

        String status;
        if (statusAkun.equalsIgnoreCase("BLACK-LISTED")) {
            status = "REJECTED_BLACKLIST";
        } else if (nominalTransaksi > sisaSaldo) {
            status = "REJECTED_SALDO";
        } else if (nominalTransaksi > 10000) {
            status = "REJECTED_LIMIT";
        } else if (isBedaNegara && nominalTransaksi > 2000) {
            status = "FLAGGED_FRAUD";
        } else if (jamTransaksi >= 0 && jamTransaksi <= 4
                && nominalTransaksi > 1000) {
            status = "REQUIRE_OTP_NIGHT";
        } else if (statusAkun.equalsIgnoreCase("SUSPICIOUS")
                && nominalTransaksi > 500) {
            status = "REQUIRE_OTP_SUSPICIOUS";
        } else {
            status = "APPROVED";
        }
        
        System.out.println("Status transaksi: " + status);
        sc.close();
    }
}