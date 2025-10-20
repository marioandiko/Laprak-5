// Kelas Main bertanggung jawab menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array/menyimpan data Mahasiswa
        Mahasiswa[] daftarMhs = new Mahasiswa[3];
        daftarMhs[0] = new Mahasiswa("King Zaki", 95);
        daftarMhs[1] = new Mahasiswa("Prince Ardi", 85);
        daftarMhs[2] = new Mahasiswa("Ajudan Farrash", 60);

        // Menampilkan semua data mahasiswa
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa m : daftarMhs) {
            System.out.println("Nama: " + m.getNama() + " - Nilai: " + m.getNilai());
        }

        // Mencari mahasiswa dengan nilai tertinggi
        Mahasiswa tertinggi = daftarMhs[0];
        for (Mahasiswa m : daftarMhs) {
            if (m.getNilai() > tertinggi.getNilai()) {
                tertinggi = m;
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi: " 
                           + tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}
