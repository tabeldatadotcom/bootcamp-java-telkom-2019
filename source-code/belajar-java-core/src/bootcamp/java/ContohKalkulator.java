package bootcamp.java;


 /*
 Import ini berfungsi untuk memanggil sebuah Class yang berbeda Folder Package dengan Class yang kita buat.
 Dalam kasus ini kita sedang membuat sebuah Class dengan nama "ContohKalkulator".
 Class "Contoh Kalkulator" ini berada di Folder package bootcamp.java, sedangkan Class yang kita panggil berada pada folder package bootcamp.java.oop
 */

import bootcamp.java.oop.KelasPembagian;
import bootcamp.java.oop.KelasPengurangan;
import bootcamp.java.oop.KelasPenjumlahan;
import bootcamp.java.oop.KelasPerkalian;

public class ContohKalkulator {

    public static void main(String[] args) {

        // Proses Penciptaan Objek Baru dari masing-masing Class
        KelasPenjumlahan penjumlahan = new KelasPenjumlahan();
        KelasPengurangan pengurangan = new KelasPengurangan();
        KelasPerkalian perkalian = new KelasPerkalian();
        KelasPembagian pembagian = new KelasPembagian();


        // Proses Deklarasi Variabel pembungkus Obejk
        int hasilPenjumlahan = penjumlahan.jumlahkan(90, 40);
        int hasilPengurangan = pengurangan.kurangin(1000, 564);
        int hasilPerkalian = perkalian.kalikan(30, 50);
        int hasilPembagian = pembagian.bagikan(100, 20);


        // Proses menampilkan hasil dari setiap operasi
        System.out.println("Ini Adalah Hasil Penjumlahan Menggunakan Objek : " + hasilPenjumlahan);
        System.out.println("Ini Adalah Hasil Pengurangan Menggunakan Objek : " + hasilPengurangan);
        System.out.println("Ini Adalah Hasil Perkalian Menggunakan Objek : " + hasilPerkalian);
        System.out.println("Ini Adalah Hasil Pembagian Menggunakan Objek : " + hasilPembagian);

    }

}
