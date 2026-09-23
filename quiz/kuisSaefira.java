package quiz;
import java.util.Scanner;
//Saefira Bahari TI-1D 264107020247
public class kuisSaefira {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//deklarasi scanner

        System.out.println(" Sistem Perhitungan Keuntungan Produk Toko Elektronik ");
        //Masukkan data untuk produk Handphone
        System.out.println("--- Handphone ---");
        System.out.print("Masukkan Harga Jual HP: ");
        int hargaJualHp = sc.nextInt();
        System.out.print("Masukkan Harga Beli HP: ");
        int hargaBeliHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman HP: ");
        int biayaPengirimanHp = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan HP: ");
        int biayaPengemasanHp = sc.nextInt();
        System.out.print("Masukkan Diskon HP: ");
        int diskonHp = sc.nextInt();
        System.out.print("Masukkan Faktor Resiko Kerusakan HP %: ");
        double faktorResikoHp = sc.nextDouble(); //menggunakan double karna persentase resiko bisa berupa desimal
        System.out.print("Masukkan Jumlah Terjual HP: ");
        int jumlahTerjualHp = sc.nextInt();
        //Perhitungan pada produk hp
        int keuntunganPerItemHp = hargaJualHp - hargaBeliHp - biayaPengirimanHp - biayaPengemasanHp - diskonHp;
        double jumlahItemPenghitungKeuntunganHp = jumlahTerjualHp - (faktorResikoHp / 100 * jumlahTerjualHp);
        double keuntunganProdukHp = keuntunganPerItemHp * jumlahItemPenghitungKeuntunganHp;


        //Masukkan data untuk produk Kabel
        System.out.println("--- Kabel ---");
        System.out.print("Masukkan Harga Jual Kabel: ");
        int hargaJualKabel = sc.nextInt();
        System.out.print("Masukkan Harga Beli Kabel: ");
        int hargaBeliKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman Kabel: ");
        int biayaPengirimanKabel = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan Kabel: ");
        int biayaPengemasanKabel = sc.nextInt();
        System.out.print("Masukkan Diskon Kabel: ");
        int diskonKabel = sc.nextInt();
        System.out.print("Masukkan Faktor Resiko Kerusakan Kabel %: ");
        double faktorResikoKabel = sc.nextDouble();
        System.out.print("Masukkan Jumlah Terjual Kabel: ");
        int jumlahTerjualKabel = sc.nextInt();
        //perhitungan pada produk kabel
        int keuntunganPerItemKabel = hargaJualKabel - hargaBeliKabel - biayaPengirimanKabel - biayaPengemasanKabel - diskonKabel;
        double jumlahItemPenghitungKeuntunganKabel = jumlahTerjualKabel - (faktorResikoKabel / 100 * jumlahTerjualKabel);
        double keuntunganProdukKabel = keuntunganPerItemKabel * jumlahItemPenghitungKeuntunganKabel;

        //Masukkan data untuk produk Earphone
        System.out.println("--- Earphone ---");
        System.out.print("Masukkan Harga Jual Earphone: ");
        int hargaJualEarphone = sc.nextInt();
        System.out.print("Masukkan Harga Beli Earphone: ");
        int hargaBeliEarphone = sc.nextInt();
        System.out.print("Masukkan Biaya Pengiriman Earphone: ");
        int biayaPengirimanEarphone = sc.nextInt();
        System.out.print("Masukkan Biaya Pengemasan Earphone: ");
        int biayaPengemasanEarphone = sc.nextInt();
        System.out.print("Masukkan Diskon Earphone: ");
        int diskonEarphone = sc.nextInt();
        System.out.print("Masukkan Faktor Resiko Kerusakan Earphone %: ");
        double faktorResikoEarphone = sc.nextDouble();
        System.out.print("Masukkan Jumlah Terjual Earphone: ");
        int jumlahTerjualEarphone = sc.nextInt();
        //perhitungan pada produk earphone
        int keuntunganPerItemEarphone = hargaJualEarphone - hargaBeliEarphone - biayaPengirimanEarphone - biayaPengemasanEarphone - diskonEarphone;
        double jumlahItemPenghitungKeuntunganEarphone = jumlahTerjualEarphone - (faktorResikoEarphone / 100 * jumlahTerjualEarphone);
        double keuntunganProdukEarphone = keuntunganPerItemEarphone * jumlahItemPenghitungKeuntunganEarphone;
        //memasukkan target keuntungan yang diharapkan
        System.out.println("Perhitungan Target Keuntungan");
        System.out.print("Masukkan Target Keuntungan yang Diharapkan: ");
        double targetKeuntungan = sc.nextDouble();

        // Menampilkan Hasil Akhir dari seluruh perhitungan keuntungan produk
        System.out.println("------ Hasil Perhitungan Keuntungan Produk Toko Elektronik ------");
        System.out.println("Handphone");
        System.out.println("Keuntungan Per Item: Rp" + keuntunganPerItemHp);
        System.out.println("Jumlah Item Penghitung Keuntungan: " + jumlahItemPenghitungKeuntunganHp);
        System.out.println("Keuntungan Produk: Rp" + (int) keuntunganProdukHp);
        System.out.println("Kabel");
        System.out.println("Keuntungan Per Item: Rp" + keuntunganPerItemKabel);
        System.out.println("Jumlah Item Penghitung Keuntungan: " + jumlahItemPenghitungKeuntunganKabel);
        System.out.println("Keuntungan Produk: Rp" + (int) keuntunganProdukKabel);
        System.out.println("Earphone");
        System.out.println("Keuntungan Per Item: Rp" + keuntunganPerItemEarphone);
        System.out.println("Jumlah Item Penghitung Keuntungan: " + jumlahItemPenghitungKeuntunganEarphone);
        System.out.println("Keuntungan Produk: Rp" + (int) keuntunganProdukEarphone);
        //menghitung semua untung dari setiap produk yang ada
        System.out.println("-----------------------");
        double totalKeuntunganSemuaProduk = keuntunganProdukHp + keuntunganProdukKabel + keuntunganProdukEarphone;
        System.out.println("Total Keuntungan Semua Produk: Rp" + (int) totalKeuntunganSemuaProduk);
        System.out.println("Rata-Rata Keuntungan Produk: Rp" + (int) (totalKeuntunganSemuaProduk / 3));
        System.out.println("Presentase yang diharapkan %: " + (int) ((totalKeuntunganSemuaProduk / targetKeuntungan) * 100));
    }
}

