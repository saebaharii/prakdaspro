# JOBSHEET 4 - PEMILIHAN 1

**Identitas Mahasiswa:**
* **Nama:** Saefira Bahari
* **NIM:** 264107020247
* **Kelas / No. Presensi:** TI-1D/26

---

## 1: TUJUAN PRAKTIKUM

Berikut adalah tujuan pelaksanaan praktikum pada bab ini:

1. Mahasiswa mampu menyelesaikan permasalahan atau studi kasus menggunakan sintaks pemilihan sederhana.
2. Mahasiswa mampu menerapkan sintaks pemilihan sederhana ke dalam program Java.
3. Mahasiswa mampu memahami penggunaan `if`, `if-else`, `if-else-if`, dan `switch-case` untuk mengatur alur program.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Penerapan IF dan IF-ELSE untuk Mencetak KRS

Percobaan pertama membuat program pencetakan KRS. Program menerima masukan status pembayaran UKT dalam bentuk `boolean`. Jika UKT sudah lunas, sistem menampilkan informasi bahwa KRS dapat dicetak. Jika belum lunas, sistem menampilkan pesan penolakan registrasi.

#### 2.1.1 Kode Program Java
```java
package week5;

import java.util.Scanner;

public class PemilihanIfElseNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Masukkan semester saat ini : ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("Anda berada di semester 1");
        } else if (semester == 2) {
            System.out.println("Anda berada di semester 2");
        } else if (semester == 3) {
            System.out.println("Anda berada di semester 3");
        } else if (semester == 4) {
            System.out.println("Anda berada di semester 4");
        } else if (semester == 5) {
            System.out.println("Anda berada di semester 5");
        } else if (semester == 6) {
            System.out.println("Anda berada di semester 6");
        } else if (semester == 7) {
            System.out.println("Anda berada di semester 7");
        } else if (semester == 8) {
            System.out.println("Anda berada di semester 8");
        } else {
            System.out.println("Semester tidak valid");
        }
    }
}
```

#### 2.1.2 Hasil Running / Screenshot Output

Untuk masukan `false`, program dasar hanya mencetak judul, pertanyaan status UKT, dan nilai masukan. Blok `if` tidak dijalankan karena kondisi bernilai `false`. Setelah ditambahkan `else`, keluaran yang dihasilkan adalah:

```text
---- Cetak KRS SIAKAD ----
Apakah UKT sudah lunas? (true/false) : false
Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.
```

Untuk masukan `true`, program menampilkan pesan bahwa pembayaran UKT telah terverifikasi dan mahasiswa dapat mencetak KRS. Nilai `TRUE` juga diterima karena `Scanner.nextBoolean()` tidak membedakan huruf besar dan kecil. Masukan `ya` menyebabkan `InputMismatchException` karena tipe data yang diterima hanya `true` atau `false`.

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Nilai apa yang harus dimasukkan agar kedua baris di dalam blok `if` ikut tercetak?  
  * **Jawab:** Nilai yang dimasukkan harus `true`, karena blok `if` hanya dijalankan ketika kondisi `uktLunas` bernilai `true`.
* **Pertanyaan 2:** Apa yang terjadi ketika input yang dimasukkan adalah `false`?  
  * **Jawab:** Blok `if` dilewati sehingga baris keluaran di dalamnya tidak muncul. Jika struktur `else` sudah ditambahkan, program menjalankan blok `else` dan menampilkan pesan agar UKT dilunasi terlebih dahulu.
* **Pertanyaan 3:** Apa perbedaan input `TRUE` dan `ya`?  
  * **Jawab:** `TRUE` tetap diterima oleh `nextBoolean()` karena tidak membedakan huruf besar dan kecil. Input `ya` menyebabkan error karena bukan nilai boolean yang valid.

---

### 2.2 Percobaan 2: SWITCH-CASE untuk Mencetak KRS

Percobaan kedua memeriksa semester mahasiswa menggunakan `switch-case`. Setiap nilai semester dari 1 sampai 8 memiliki keluaran masing-masing. Perintah `break` digunakan agar eksekusi berhenti setelah case yang sesuai ditemukan.

#### 2.2.1 Kode Program Java
```java
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
            default:
                System.out.println("Semester tidak valid");
                break;
        }
    }
}
```

#### 2.2.2 Tabel Pengujian Parameter Output

| No | Input Parameter | Output yang Dihasilkan | Status Eksekusi |
| :---: | :--- | :--- | :---: |
| 1 | `1` | `Anda berada di semester 1` | Valid |
| 2 | `5` | `Anda berada di semester 5` | Valid |
| 3 | `8` | `Anda berada di semester 8` | Valid |
| 4 | `10` | `Semester tidak valid` | Tidak valid |
| 5 | `0` | `Semester tidak valid` | Tidak valid |

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa fungsi `break` pada struktur `switch-case`?  
  * **Jawab:** `break` menghentikan eksekusi setelah case yang sesuai dijalankan sehingga program tidak meneruskan eksekusi ke case berikutnya. Jika `break` pada case 5 dihapus dan inputnya `5`, keluaran dari case 5 dan case setelahnya akan ikut dijalankan sampai menemukan `break`.
* **Pertanyaan 2:** Apa peran `default`?  
  * **Jawab:** `default` menangani nilai yang tidak sesuai dengan case mana pun. Input `10` dan `0` menghasilkan `Semester tidak valid`. Jika `default` dihapus, input yang tidak valid tidak menghasilkan keluaran dari struktur `switch`.
* **Pertanyaan 3:** Apakah `double` dapat digunakan sebagai ekspresi `switch`?  
  * **Jawab:** Tidak. Java menampilkan error `selector type double is not allowed`. Tipe data yang dapat digunakan antara lain `byte`, `short`, `char`, `int`, `String`, dan `enum`; `float` dan `double` tidak diperbolehkan.
* **Pertanyaan 4:** Mana yang lebih mudah dibaca untuk kasus semester, `switch-case` atau `if-else-if`?  
  * **Jawab:** `switch-case` lebih mudah dibaca karena setiap pilihan semester ditulis secara terpisah dan nilai yang dibandingkan hanya satu variabel.

---

## 3: TUGAS MANDIRI

Berikut adalah tugas yang dikerjakan pada Jobsheet ini:

- [x] **Tugas 1:** Mengubah struktur `if-else` menjadi *Ternary Operator*.
- [x] **Tugas 2:** Mengimplementasikan validasi jumlah SKS berdasarkan batas maksimal 24 SKS.
- [x] **Tugas 3:** Mengimplementasikan studi kasus parkir dan mesin antrean akademik.

### 3.1 Tugas 1: Implementasi Ternary Operator

```java
package week5;

import java.util.Scanner;

public class tugas1Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cetak KRS SIAKAD ----");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas
            ? "Pembayaran UKT berhasil terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu.";

        System.out.println(pesan);
    }
}
```

Ternary operator sesuai digunakan ketika kondisinya sederhana dan hanya memiliki dua kemungkinan hasil. Untuk kondisi yang kompleks atau memiliki banyak cabang, `if-else` lebih mudah dibaca dan dipelihara.

### 3.2 Tugas 2: Validasi Jumlah SKS

```java
package week5;

import java.util.Scanner;

public class tugas2Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Cek Jumlah KRS SIAKAD ----");
        System.out.print("Masukkan Jumlah SKS semester saat ini : ");
        int sks = sc.nextInt();

        if (sks > 24) {
            System.out.println("Jumlah SKS melebihi batas.");
        } else {
            System.out.println("Jumlah SKS Valid.");
        }
    }
}
```

Program membandingkan jumlah SKS dengan batas maksimal 24. Masukan lebih dari 24 menghasilkan pesan bahwa jumlah SKS melebihi batas, sedangkan masukan 24 atau kurang dinyatakan valid.

### 3.3 Tugas 3: Studi Kasus Parkir dan Mesin Antrean

#### 3.3.1 Program Perhitungan Tarif Parkir

```java
package week5;

import java.util.Scanner;

public class tugasParkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Perhitungan Tarif Parkir Mall ----");
        System.out.print("Masukkan lama parkir (jam): ");
        int jam = sc.nextInt();
        int tarif;

        if (jam <= 2) {
            tarif = 2000;
        } else {
            tarif = 2000 + (jam - 2) * 1000;
        }
        System.out.println("Total tarif parkir: Rp " + tarif);
    }
}
```

Dua jam pertama dikenakan tarif Rp2.000. Setiap jam berikutnya menambah tarif Rp1.000. Sebagai contoh, lama parkir 4 jam menghasilkan tarif Rp4.000.

#### 3.3.2 Program Mesin Antrean Akademik

```java
package week5;

import java.util.Scanner;

public class tugasAntrean26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Mesin Antrean Akademik ---");
        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = sc.nextInt();

        switch (kode) {
            case 1:
                System.out.println("Layanan : Legalisir Ijazah");
                System.out.println("Loket   : Loket A");
                break;
            case 2:
                System.out.println("Layanan : Surat Keterangan Aktif Kuliah");
                System.out.println("Loket   : Loket B");
                break;
            case 3:
                System.out.println("Layanan : Pembayaran UKT");
                System.out.println("Loket   : Loket C");
                break;
            case 4:
                System.out.println("Layanan : Pengajuan Cuti Akademik");
                System.out.println("Loket   : Loket D");
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }
    }
}
```

Program menggunakan `switch-case` untuk memilih layanan berdasarkan kode 1 sampai 4. Bagian `default` menangani kode di luar rentang tersebut dengan menampilkan pesan `Kode layanan tidak tersedia`.

---

## 4: KESIMPULAN

Struktur pemilihan digunakan untuk mengatur alur program berdasarkan kondisi atau nilai masukan. Pada Jobsheet ini, `if`, `if-else`, dan `if-else-if` digunakan untuk keputusan berbasis kondisi, sedangkan `switch-case` digunakan untuk beberapa pilihan nilai yang spesifik. Ternary operator dapat menyederhanakan keputusan dengan dua hasil, tetapi kurang sesuai untuk logika yang kompleks. Melalui studi kasus KRS, validasi SKS, parkir, dan antrean akademik, struktur pemilihan dapat diterapkan untuk menghasilkan program Java yang sesuai dengan kebutuhan pengguna.