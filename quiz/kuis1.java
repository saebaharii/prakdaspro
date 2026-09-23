package quiz;
import java.util.Scanner;

//Saefira Bahari TI-1D 264107020247
public class kuis1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perhitungan Item Handphone");
        System.out.print("Masukkan Harga Jual HP: ");
        int hargaJualHp = sc.nextInt();
        System.out.print("Masukkan Harga Beli HP: ");
        int hargaBeliHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman: ");
        int biayaPengirimanHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan: ");
        int biayaPengemasanHp = sc.nextInt();
        System.out.print("Masukkan Diskon: ");
        int diskonHp = sc.nextInt();
        //perhitungan keuntungan per item hp
        int keuntunganPerItemHp = hargaJualHp - hargaBeliHp - biayaPengirimanHp - biayaPengemasanHp - diskonHp;
        System.out.print("Masukkan Faktor Resiko Kerusakan %: ");
        double faktorResikoHp = sc.nextDouble();
        System.out.print("Masukkan Jumlah Terjual: ");
        int jumlahTerjualHp = sc.nextInt();

        double jumlahItemPenghitungKeuntunganHp = jumlahTerjualHp - (faktorResikoHp / 100 * jumlahTerjualHp);
        double keuntunganProdukHp = keuntunganPerItemHp  * jumlahItemPenghitungKeuntunganHp;

        System.out.println(" HASIL PERHITUNGAN "); //hasil perhitungan
        System.out.println("Keuntungan Per Item HP: " + keuntunganPerItemHp);
        System.out.println("Jumlah Item Penghitung Keuntungan: " + jumlahItemPenghitungKeuntunganHp);
        System.out.println("Keuntungan Produk HP: " + keuntunganProdukHp);

        System.out.println("\nPerhitungan Item Kabel");
        System.out.print("Masukkan Harga Jual Kabel: ");
        int hargaJualKabel = sc.nextInt();
        System.out.print("Masukkan Harga Beli Kabel: ");
        int hargaBeliKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan: ");
        int biayaPengemasanKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman: ");
        int biayaPengirimanKabel = sc.nextInt();
        System.out.print("Masukkan Diskon: ");
        int diskonKabel = sc.nextInt();
        int keuntunganItemKabel = hargaJualKabel - hargaBeliKabel - biayaPengemasanKabel - biayaPengirimanKabel - diskonKabel;
        
        System.out.print("Masukkan Faktor Resiko Kerusakan %: ");
        double faktorResikoKabel = sc.nextDouble();
        System.out.print("Masukkan Jumlah Penjualan: ");
        int jumlahPenjualanKabel = sc.nextInt();

        double jumlahItemPenghitungKeuntunganKabel = jumlahPenjualanKabel - (faktorResikoKabel / 100 * jumlahPenjualanKabel);
        double totalKeuntunganProdukKabel = keuntunganItemKabel * jumlahItemPenghitungKeuntunganKabel;

        System.out.println("Keuntungan Item Kabel: " + keuntunganItemKabel);
        System.out.println("Jumlah Terjual Setelah Risiko Kabel: " + jumlahItemPenghitungKeuntunganKabel);
        System.out.println("Total Keuntungan Produk Kabel: " + totalKeuntunganProdukKabel);

        System.out.println("\nPerhitungan Item Earphone");
        System.out.print("Masukkan Harga Jual Earphone: ");
        int hargaJualEarphone = sc.nextInt();
        System.out.print("Masukkan Harga Beli Earphone: ");
        int hargaBeliEarphone = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan: ");
        int biayaPengemasanEarphone = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman: ");
        int biayaPengirimanEarphone = sc.nextInt();
        System.out.print("Masukkan Diskon: ");
        int diskonEarphone = sc.nextInt();
        int keuntunganItemEarphone = hargaJualEarphone - hargaBeliEarphone - biayaPengemasanEarphone - biayaPengirimanEarphone - diskonEarphone;

        System.out.print("Masukkan Faktor Resiko Kerusakan %: ");
        double faktorResikoEarphone = sc.nextDouble();
        System.out.print("Masukkan Jumlah Penjualan: ");
        int jumlahPenjualanEarphone = sc.nextInt();

        double jumlahItemPenghitungKeuntunganEarphone = jumlahPenjualanEarphone - (faktorResikoEarphone / 100 * jumlahPenjualanEarphone);
        double totalKeuntunganProdukEarphone = keuntunganItemEarphone * jumlahItemPenghitungKeuntunganEarphone;

        System.out.println("Keuntungan Item Earphone: " + keuntunganItemEarphone);
        System.out.println("Jumlah Terjual Setelah Risiko Earphone: " + jumlahItemPenghitungKeuntunganEarphone);
        System.out.println("Total Keuntungan Produk Earphone: " + totalKeuntunganProdukEarphone);

        double totalKeuntunganSemuaProduk = keuntunganProdukHp + totalKeuntunganProdukKabel + totalKeuntunganProdukEarphone;
        System.out.println("\nTotal Keuntungan Semua Jenis Produk: " + totalKeuntunganSemuaProduk);

        sc.close();
    }
}
