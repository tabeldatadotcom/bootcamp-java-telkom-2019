package bootcamp.java;

public class PengenalanArray {
    public static void main(String[] args) {
        String[] kendaraan = {"Ford", "BMW", "Lambo", "Peugot", "Ferrari"};
        System.out.println("Jumlah Isi Array : " + kendaraan.length);

        // Ekstrak Array Value With ForLoop
//        for(int itr = 0; itr < kendaraan.length; itr++) {
//            System.out.println(kendaraan[itr]);
//        }

        // Ekstark Array Value with While Do
//        int itr2 = 0;
//        while (itr2 < kendaraan.length) {
//            System.out.println(kendaraan[itr2]);
//            itr2++;
//        }

        // Ekstrak Value With For-Each
        for (String valueArray: kendaraan) {
            System.out.println(valueArray);
        }

    }
}
