package week5;
import java.util.Scanner;
public class pemilihanSwitch26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Masukkan semester saat ini : ");
        int semester = sc.nextInt();

        switch (semester) {
            case 1:
                System.out.println("Anda berada di semester 1");
                break;
            case 2:
                System.out.println("Anda berada di semester 2");
                break;
            case 3:
                System.out.println("Anda berada di semester 3");
                break;
            case 4:
                System.out.println("Anda berada di semester 4");
                break;
            case 5:
                System.out.println("Anda berada di semester 5");
                break;
            case 6:
                System.out.println("Anda berada di semester 6");
                break;
            case 7:
                System.out.println("Anda berada di semester 7");
                break;
            case 8:
                System.out.println("Anda berada di semester 8");
                break;
        }
    }
}