package week2;
public class contohVariabelFira {
    public static void main(String[] args) {
        String hobi = "Mendengarkan Musik";
        boolean pandai = true;
        char jenisKelamin = 'P';
        byte umur = 18;
        double ipk = 3.75, tinggiBadan = 151;

        System.out.println("Hobi saya: " +hobi);
        System.out.println("Apakah Pandai? " + pandai);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umur);
        System.out.println(String.format("Saya beripk: %s, dengan tinggi badan %s", ipk, tinggiBadan));
    } 
}