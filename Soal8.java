public class Soal8 {
    
    public static void main(String[] args) {
        // Membuat array 2D
        int[][] angka = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 9, 11}
        };

        // a. Menampilkan isi matriks
        System.out.println("Isi Matriks:");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }

        // b. Menghitung jumlah seluruh elemen
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                jumlah += angka[i][j];
            }
        }

        // c. Menampilkan hasil penjumlahan
        System.out.println("\nJumlah semua elemen = " + jumlah);
    }
}