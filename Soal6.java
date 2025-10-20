import java.util.Scanner;

public class Soal6 { // <-- Class harus ada
    
    public static void main(String[] args) {
        
        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai k (jumlah rotasi ke kanan): ");
        int k = input.nextInt();
        
        // Pastikan k tidak lebih besar dari panjang array
        // Menggunakan modulo (%) agar rotasi berulang tetap benar.
        k = k % data.length;
        
        // Proses rotasi tanpa membuat array baru (menggunakan teknik 3-Reverse)
        
        // 1. Balik seluruh array
        reverse(data, 0, data.length - 1);
        
        // 2. Balik sub-array dari 0 hingga k - 1
        reverse(data, 0, k - 1);
        
        // 3. Balik sisa sub-array dari k hingga akhir array
        reverse(data, k, data.length - 1);
        
        // Tampilkan hasil setelah rotasi
        System.out.print("Array setelah rotasi: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        
        input.close(); 
    }
    
    // Method untuk membalikkan elemen array di antara indeks start dan end
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
} // <-- Kurung kurawal penutup class