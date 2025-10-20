// Kelas Mahasiswa bertanggung jawab menyimpan data mahasiswa
class Mahasiswa {
    private String nama;
    private int nilai;

    // Konstruktor
    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk nilai
    public int getNilai() {
        return nilai;
    }
}
