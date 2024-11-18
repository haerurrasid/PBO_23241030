public class HitungGajiBersih {
    // Atribut private
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter untuk gajiPokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk gajiPokok
    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter untuk pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Getter untuk pajak dalam rupiah
    public double getPajak() {
        return (gajiPokok + tunjangan) * (pajak / 100);
    }

    // Metode untuk mencetak gaji bersih
    public void cetakGajiBersih() {
        double gajiBersih = (gajiPokok + tunjangan) - getPajak();
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }

    // Main method untuk testing
    public static void main(String[] args) {
        HitungGajiBersih hitung = new HitungGajiBersih();
        hitung.setGajiPokok(3000000); // Contoh gaji pokok
        hitung.setTunjangan(2000000); // Contoh tunjangan
        hitung.setPajak(10); // Contoh pajak 10%

        System.out.println("Gaji Pokok: Rp " + hitung.getGajiPokok());
        System.out.println("Tunjangan: Rp " + hitung.getTunjangan());
        System.out.println("Pajak (Rp): Rp " + hitung.getPajak());
        hitung.cetakGajiBersih();
    }
}