# JOBSHEET 6 - PEMILIHAN 2

**Identitas Mahasiswa:**
* **Nama:** Saefira Bahari
* **NIM:** 264107020247
* **Kelas / No. Presensi:** TI-1D/26

---

## 1: TUJUAN PRAKTIKUM

1. Mahasiswa mampu menyelesaikan studi kasus menggunakan sintaks pemilihan bersarang.
2. Mahasiswa mampu menerapkan sintaks pemilihan bersarang pada program Java.
3. Mahasiswa mampu menerapkan operator logika `&&`, `||`, dan `!` pada struktur pemilihan.

---

## 2: HASIL PERCOBAAN & ANALISIS

### 2.1 Percobaan 1: Nested IF untuk Mengecek Syarat Ujian Skripsi

Program memeriksa syarat administrasi berupa bebas kompen terlebih dahulu. Jika terpenuhi, program memeriksa jumlah bimbingan dengan kedua pembimbing. Mahasiswa dapat mendaftar ujian jika bimbingan Pembimbing 1 minimal 8 kali dan Pembimbing 2 minimal 4 kali.

#### 2.1.1 Kode Program Java

```java
package week6;
import java.util.Scanner;

public class nestedUjian26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa bebas kompen? Ya/Tidak?: ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
    }
}
```

#### 2.1.2 Tabel Pengujian

| No. | Bebas kompen | Bimbingan P1 | Bimbingan P2 | Hasil |
| :---: | :---: | :---: | :---: | :--- |
| 1 | Tidak | 8 | 4 | Gagal karena masih memiliki tanggungan kompen |
| 2 | Ya | 8 | 4 | Boleh mendaftar ujian skripsi |
| 3 | Ya | 6 | 2 | P1 dan P2 belum memenuhi jumlah bimbingan |
| 4 | Ya | 6 | 4 | Bimbingan P1 belum mencapai 8 kali |
| 5 | Ya | 8 | 3 | Bimbingan P2 belum mencapai 4 kali |

#### 2.1.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?  
  * **Jawab:** Program menampilkan bahwa mahasiswa masih memiliki tanggungan kompen dan tidak memeriksa syarat bimbingan.
* **Pertanyaan 2:** Apa maksud pemeriksaan jumlah bimbingan pada kondisi kedua?  
  * **Jawab:** Kondisi tersebut memastikan jumlah bimbingan P1 minimal 8 kali dan P2 minimal 4 kali. Keduanya harus terpenuhi.
* **Pertanyaan 3:** Bagaimana alur pemeriksaan syarat dari awal sampai akhir?  
  * **Jawab:** Program memeriksa status bebas kompen terlebih dahulu. Jika jawabannya "Ya", program memeriksa jumlah bimbingan. Jika keduanya memenuhi batas minimum, mahasiswa boleh mendaftar. Jika tidak, program menampilkan syarat bimbingan yang belum terpenuhi. Jika tidak bebas kompen, program langsung menampilkan alasan tersebut.

---

### 2.2 Percobaan 2: Operator Logika untuk Menentukan Akses WiFi Kampus

Program memberikan akses WiFi kepada pengguna yang merupakan mahasiswa atau dosen, selama akunnya tidak diblokir. Kondisi ini menggunakan `||`, `&&`, dan `!`.

#### 2.2.1 Kode Program Java

```java
import java.util.Scanner;

public class operator26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
}
```

#### 2.2.2 Tabel Pengujian

| No. | Mahasiswa | Dosen | Akun diblokir | Hasil |
| :---: | :---: | :---: | :---: | :--- |
| 1 | true | false | false | Akses WiFi diberikan |
| 2 | false | true | false | Akses WiFi diberikan |
| 3 | true | false | true | Akses WiFi ditolak |
| 4 | false | false | false | Akses WiFi ditolak |

#### 2.2.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Apa fungsi operator `||`, `&&`, dan `!`?  
  * **Jawab:** `||` berarti salah satu kondisi benar, `&&` berarti kedua kondisi harus benar, dan `!` membalik nilai kondisi.
* **Pertanyaan 2:** Mengapa dosen tetap dapat memperoleh akses saat `mahasiswa = false`?  
  * **Jawab:** Karena operator `||` menghasilkan true jika `dosen` bernilai true, selama akun tidak diblokir.
* **Pertanyaan 3:** Apa yang terjadi jika `||` diubah menjadi `&&` pada data uji 1?  
  * **Jawab:** Akses ditolak karena data uji 1 memiliki `mahasiswa = true` dan `dosen = false`. Operator `&&` memerlukan keduanya true.
* **Pertanyaan 4:** Kapan kondisi `dosen` tidak perlu dievaluasi pada `mahasiswa || dosen`?  
  * **Jawab:** Ketika `mahasiswa` bernilai true. Hasil OR sudah pasti true sehingga Java melewati evaluasi kondisi `dosen` (short-circuit).
* **Pertanyaan 5:** Kapan `!akunDiblokir` tidak perlu dievaluasi pada `(mahasiswa || dosen) && !akunDiblokir`?  
  * **Jawab:** Ketika `(mahasiswa || dosen)` bernilai false. Hasil AND sudah pasti false sehingga Java melewati kondisi berikutnya.

---

### 2.3 Percobaan 3: Nested IF untuk Menentukan Akses Laboratorium

Mahasiswa dapat menggunakan laboratorium jika berstatus aktif, tidak sedang disanksi, dan memiliki izin dosen atau berstatus asisten lab. Nested IF digunakan agar alasan penolakan pada dua tahap dapat dibedakan.

#### 2.3.1 Kode Program Java

```java
package week6;
import java.util.Scanner;

public class nestedAkses26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah sebagai asisten lab? (true/false): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
}
```

#### 2.3.2 Tabel Pengujian

| No. | Mahasiswa aktif | Sedang disanksi | Punya izin dosen | Asisten lab | Hasil |
| :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | true | false | true | false | Akses laboratorium diberikan |
| 2 | true | false | false | true | Akses laboratorium diberikan |
| 3 | true | false | false | false | Ditolak: membutuhkan izin dosen atau status asisten lab |
| 4 | false | false | true | true | Ditolak: status mahasiswa tidak memenuhi syarat |

#### 2.3.3 Jawaban Pertanyaan / Pertanyaan Refleksi

* **Pertanyaan 1:** Mengapa pemeriksaan izin dosen atau asisten lab berada di dalam IF pertama?  
  * **Jawab:** Mahasiswa harus memenuhi syarat aktif dan tidak disanksi terlebih dahulu.
* **Pertanyaan 2:** Apa fungsi `&&`, `||`, dan `!` pada program?  
  * **Jawab:** `&&` memerlukan kedua syarat benar, `||` memerlukan salah satu syarat benar, dan `!` membalik nilai kondisi.
* **Pertanyaan 3:** Apakah syarat akses bisa ditulis menjadi satu kondisi?  
  * **Jawab:** Bisa, dengan kondisi `mahasiswaAktif && !sedangDisanksi && (punyaIzinDosen || asistenLab)`. Keputusan aksesnya sama, tetapi Nested IF memudahkan program memberi alasan penolakan yang berbeda.
* **Pertanyaan 4:** Apa keuntungan Nested IF jika alasan penolakan perlu dibedakan?  
  * **Jawab:** Program dapat menampilkan alasan berdasarkan tahap atau syarat yang tidak terpenuhi.
* **Pertanyaan 5:** Berikan contoh penolakan di level pertama dan kedua.  
  * **Jawab:** Level pertama: `false, false, true, true`. Level kedua: `true, false, false, false`.

---

## 3: TUGAS MANDIRI

### 3.1 Sistem Diskon Toko Buku

Program menerapkan diskon hanya pada hari Rabu. Pada hari tersebut, diskon ditentukan oleh jenis dan jumlah buku yang dibeli.

#### Kode Program Java

```java
package week6;
import java.util.Scanner;

public class nestedBuku26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah hari ini adalah hari Rabu? (true/false): ");
        boolean isRabu = sc.nextBoolean();

        if (isRabu) {
            System.out.println("Selamat, Anda akan mendapatkan diskon!");
            System.out.print("Apakah jenis buku adalah kamus? (true/false): ");
            boolean isKamus = sc.nextBoolean();

            if (isKamus) {
                System.out.println("Anda mendapatkan diskon 10%");
                System.out.print("Masukkan jumlah kamus yang dibeli: ");
                int jumlahKamus = sc.nextInt();
                if (jumlahKamus > 2) {
                    System.out.println("Anda mendapat tambahan diskon 2%, total diskon Anda 12%");
                }
            } else {
                System.out.print("Apakah jenis buku adalah novel? (true/false): ");
                boolean isNovel = sc.nextBoolean();

                if (isNovel) {
                    System.out.println("Anda mendapatkan diskon 7%");
                    System.out.print("Masukkan jumlah novel yang dibeli: ");
                    int jumlahNovel = sc.nextInt();
                    if (jumlahNovel > 3) {
                        System.out.println("Anda mendapat tambahan diskon 2%, total diskon Anda 9%");
                    } else {
                        System.out.println("Anda mendapatkan diskon 1%");
                    }
                } else {
                    System.out.print("Masukkan jumlah buku: ");
                    int jumlahBuku = sc.nextInt();
                    if (jumlahBuku > 3) {
                        System.out.println("Anda mendapat diskon 5%");
                    } else {
                        System.out.println("Anda tidak mendapatkan diskon, diskon saat ini 0%");
                    }
                }
            }
        } else {
            System.out.println("Hari ini bukan hari Rabu, tidak ada diskon.");
        }
        sc.close();
    }
}
```

#### Tabel Pengujian

| No. | Hari Rabu | Jenis buku | Jumlah | Hasil |
| :---: | :---: | :--- | :---: | :--- |
| 1 | false | - | - | Tidak ada diskon |
| 2 | true | Kamus | 3 | Diskon kamus 10% dan tambahan 2% |
| 3 | true | Novel | 4 | Diskon novel 7% dan tambahan 2% |
| 4 | true | Novel | 2 | Menampilkan diskon 7% dan pesan diskon 1% |
| 5 | true | Buku lain | 4 | Diskon 5% |
| 6 | true | Buku lain | 2 | Diskon 0% |

### 3.2 Sistem Seleksi Calon Asisten Praktikum

Seleksi dilakukan bertahap: mahasiswa harus aktif dan tidak sedang disanksi, lalu memiliki nilai Dasar Pemrograman minimal 80 atau sertifikat, kemudian memperoleh nilai wawancara minimal 75.

#### Kode Program Java

```java
package week6;
import java.util.Scanner;

public class nestedAsisten26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah status mahasiswa aktif? (true/false):");
        boolean status = sc.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false):");
        boolean sanksi = sc.nextBoolean();

        if (status && !sanksi) {
            System.out.println("Anda Dapat Mengikuti Seleksi !");
            System.out.print("Masukkan nilai dasar pemograman :");
            int nilaiDaspro = sc.nextInt();
            System.out.print("Apakah mahasiswa memiliki sertifikat kompetisi (true/false):");
            boolean sertifYes = sc.nextBoolean();
            if (nilaiDaspro >= 80 || sertifYes) {
                System.out.println("Anda Lanjut Ke Proses Wawancara !");
                System.out.print("Masukkan nilai wawancara :");
                int nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 75) {
                    System.out.println("Anda diterima sebagai asisten!");
                } else {
                    System.out.println("Anda gagal di tahap wawancara, nilai dibawah 75");
                }
            } else {
                System.out.println("Anda gagal di tahap nilai/sertifikat");
            }
        } else {
            System.out.println("Anda gagal di tahap seleksi status/sanksi akademik");
        }
        sc.close();
    }
}
```

#### Tabel Pengujian

| No. | Aktif | Disanksi | Nilai Daspro | Sertifikat | Nilai wawancara | Hasil |
| :---: | :---: | :---: | :---: | :---: | :---: | :--- |
| 1 | false | false | - | - | - | Gagal pada tahap status/sanksi |
| 2 | true | false | 79 | false | - | Gagal pada tahap nilai/sertifikat |
| 3 | true | false | 80 | false | 74 | Gagal pada tahap wawancara |
| 4 | true | false | 70 | true | 75 | Diterima sebagai asisten |

---

## 4: KESIMPULAN

Struktur pemilihan bersarang memeriksa syarat secara bertahap. Operator `&&` memastikan beberapa syarat harus terpenuhi sekaligus, `||` menerima salah satu dari beberapa syarat, dan `!` membalik nilai boolean. Nested IF juga membantu menampilkan alasan kegagalan sesuai tahap pemeriksaan.
