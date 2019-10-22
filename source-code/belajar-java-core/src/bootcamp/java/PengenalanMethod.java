package bootcamp.java;


public class PengenalanMethod {

    // Method Baru
        static void mencetakString() {
            System.out.println("Saya Adalah Method Pencetak String");
        }

    static void penjumlahan(int bilPertama, int bilKedua) {

            int bilanganPr = bilPertama;
            int bilanganKd = bilKedua;
            int hasilPnj = bilanganPr + bilanganKd;

//        System.out.println("Hasil " + hasilPnj);
    }

    public int perkalian(int panjang, int lebar) {
            int hasil = panjang * lebar;
        return hasil;
    }


    public static void main(String[] args) {

            // Memanggil Method Tersebut
//        mencetakString();
//        mencetakString();
//        mencetakString();

        penjumlahan(10, 30);
        penjumlahan(50, 70);
        penjumlahan(2, 7);

    }

}
