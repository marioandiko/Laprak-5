import java.util.ArrayList;
import java.util.List;

public class Soal12 {
    public static void main(String[] args) {
        int[][] grid = {
            {5, 3, 2, 1},
            {1, 2, 10, 2},
            {4, 3, 1, 3},
            {2, 1, 2, 20}
        };

        int n = grid.length;
        int[][] dp = new int[n][n]; // menyimpan energi maksimum hingga posisi (i,j)
        int[][] path = new int[n][n]; // menyimpan arah asal langkah: 0=atas, 1=kiri

        // Inisialisasi posisi pertama
        dp[0][0] = grid[0][0];
        path[0][0] = -1; // awal, tidak ada asal

        // Baris pertama (hanya bisa dari kiri)
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j-1] + grid[0][j];
            path[0][j] = 1; // dari kiri
        }

        // Kolom pertama (hanya bisa dari atas)
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
            path[i][0] = 0; // dari atas
        }

        // Mengisi DP untuk posisi lain
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i-1][j] > dp[i][j-1]) {
                    // Pilihan dari atas (i-1, j) memberikan energi lebih besar
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                    path[i][j] = 0; // dari atas
                } else {
                    // Pilihan dari kiri (i, j-1) memberikan energi lebih besar (atau sama)
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                    path[i][j] = 1; // dari kiri
                }
            }
        }

        // Total energi maksimum
        int maxEnergy = dp[n-1][n-1];
        System.out.println("Total Energi Maksimum: " + maxEnergy);

        // Menelusuri jalur terbaik
        List<String> jalur = new ArrayList<>();
        int i = n - 1;
        int j = n - 1;
        
        while (i >= 0 && j >= 0) {
            jalur.add(0, "(" + i + "," + j + ")"); // Tambahkan di indeks 0 agar urutan benar (0,0) -> (n-1, n-1)
            
            if (path[i][j] == -1) {
                break; // Sudah mencapai titik awal (0,0)
            } else if (path[i][j] == 0) {
                i--; // Pindah ke atas
            } else if (path[i][j] == 1) {
                j--; // Pindah ke kiri
            }
        }

        System.out.print("Jalur terbaik: ");
        for (int k = 0; k < jalur.size(); k++) {
            System.out.print(jalur.get(k));
            if (k != jalur.size() - 1) System.out.print(" -> ");
        }
        System.out.println();
    }
}