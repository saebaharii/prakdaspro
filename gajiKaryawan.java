package week3;
import java.util.Scanner;
public class gajiKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gajiPokok;
        double bonus;
        int totGaji;
        double tunjTrans=600000;
        double tunjMkn=400000;
        System.out.print("Masukkan gaji pokok karyawan : ");
        gajiPokok = sc.nextInt();

        bonus = gajiPokok * 0.5;
        totGaji = (int)(gajiPokok + tunjTrans + tunjMkn + bonus - (0.1 * gajiPokok));
        System.out.println("Bonus bulanan anda adalah Rp : " + bonus);
        System.out.println("Gaji yang anda terima adalah Rp : " + totGaji);
    }
}
