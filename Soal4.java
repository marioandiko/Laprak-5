public class Soal4 {
    public static void main(String[] args) {
        int[] bilangan = new int[5]; // deklarasi array dengan ukuran 5

        // mengisi array dengan angka 1–5
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }

        // menampilkan isi array dengan for-each loop
        System.out.println("Isi array bilangan:");
        for (int angka : bilangan) {
            System.out.println(angka);
        }
    }
}
