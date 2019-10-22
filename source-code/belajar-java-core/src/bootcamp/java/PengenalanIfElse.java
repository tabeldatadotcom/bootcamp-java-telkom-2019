package bootcamp.java;

public class PengenalanIfElse {

    public static void main(String[] args) {

        boolean buttonSatu = false;
        boolean buttonDua = false;
        int hasilPenjumlahan = 2 + 5;
        String jumlahGaji = "10.000";

        // If Saja
//        if (hasilPenjumlahan == 7) {
//            System.out.println("Lampu Satu Menyala");
//        }

//        // If - Else
//        if (hasilPenjumlahan == 7) {
//            System.out.println("Lampu Satu Menyala");
//        } else {
//            System.out.println("Kondisi Tidak terpenuhi");
//        }


        // If - ElseIf - Else
//        if (hasilPenjumlahan == 7) {
//            System.out.println("Hasil Penjumlahan = 7");
//        } else if (hasilPenjumlahan == 8){
//            System.out.println("Hasil Penjumlahan = 8");
//        } else {
//            System.out.println("Ternyata Hasil Penjumlaha = " + hasilPenjumlahan);
//        }

        // Nested IF
        // IF Level Satu
        if ((hasilPenjumlahan > 0) || (hasilPenjumlahan == 10)) {
                System.out.println("Ternyata Hasil Penjumlahan = " + hasilPenjumlahan);
        } else {
            System.out.println("Lampu Padam");
        }



    }

}
