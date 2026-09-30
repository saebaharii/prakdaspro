package week6;
import java.util.Scanner;
public class AksesWifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan status (dosen/mahasiswa): ");
        String status = input.nextLine();

        if (status.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else {
            if (status.equalsIgnoreCase("mahasiswa")) {
                System.out.print("Masukkan jumlah SKS: ");
                int sks = input.nextInt();
                if (sks >= 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            } else {
                System.out.println("Akses ditolak");}
        }
        input.close();
    }
}