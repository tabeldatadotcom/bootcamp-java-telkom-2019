package bootcamp.java.oop;


/* Disini Tidak dilakukan proses Import Class yang akan dipakai sebagai objek baru karena Class yang dipanggil masih berada dalam satu folder Package yang sama
untuk Contoh yang ada proses importnya, silahkan lihat Class "ContohKalkulator".
 */

public class KelasUtama {



    public static void main(String[] args) {

        // Proses Penciptaan Objek dengan nama "penjumlahan" dari kelas induk bernama "KelasPenjumlahan"
        KelasPenjumlahan penjumlahan = new KelasPenjumlahan();

        // Objek penjumlahan disimpan kedalam sebuah variabel untuk lebih mudah dipanggil saat melakukan System Print Out
        int hasilPenjumlahan = penjumlahan.jumlahkan(10, 20);

        // Menampilkan hasil penjumlahan dengan objek yang telah diturunkan dari Kelas Penjumlahan
        System.out.println("Ini Adalah Hasil Penjumlahan Menggunakan Objek : " + hasilPenjumlahan);




        // Proses Penciptaan Objek dengan nama "pengurangan" dari kelas induk bernama "KelasPengurangan"
        KelasPengurangan pengurangan = new KelasPengurangan();

        // Objek penjumlahan disimpan kedalam sebuah variabel untuk lebih mudah dipanggil saat melakukan System Print Out
        int hasilPengurangan = pengurangan.kurangin(10, 20);

        // Menampilkan hasil penjumlahan dengan objek yang telah diturunkan dari Kelas Pengurangan
        System.out.println("Ini Adalah Hasil Pengurangan Menggunakan Objek : " + hasilPengurangan);



        // Proses Penciptaan Objek dengan nama "perkalian" dari kelas induk bernama "KelasPerkalian"
        KelasPerkalian perkalian = new KelasPerkalian();

        // Objek penjumlahan disimpan kedalam sebuah variabel untuk lebih mudah dipanggil saat melakukan System Print Out
        int hasilPerkalian = perkalian.kalikan(10, 20);

        // Menampilkan hasil penjumlahan dengan objek yang telah diturunkan dari Kelas Perkalian
        System.out.println("Ini Adalah Hasil Perkalian Menggunakan Objek : " + hasilPerkalian);



        // Proses Penciptaan Objek dengan nama "pembagian" dari kelas induk bernama "KelasPembagian"
        KelasPembagian pembagian = new KelasPembagian();

        // Objek penjumlahan disimpan kedalam sebuah variabel untuk lebih mudah dipanggil saat melakukan System Print Out
        int hasilPembagian = pembagian.bagikan(20, 10);

        // Menampilkan hasil penjumlahan dengan objek yang telah diturunkan dari Kelas Pembagian
        System.out.println("Ini Adalah Hasil Pembagian Menggunakan Objek : " + hasilPembagian);


    }

}
