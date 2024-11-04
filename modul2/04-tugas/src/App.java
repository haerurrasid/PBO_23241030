class BangunDatar{
    // Atribut
    double panjang;
    double lebar;
    double luas;
    double keliling;

    BangunDatar(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // method tanpa parameter dan return
    void menghitungLuas(){
        luas = panjang * lebar;
        System.out.println("Luas : " + this.luas);
    }
    void menghitungKeliling(){
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling : " + this.keliling);
    }

    // method tanpa return dengan parameter
    void setPanjang(double panjang){
        this.panjang = panjang;
    }
    void setLebar(double lebar){
        this.lebar = lebar;
    }

    // method dengan return tanpa parameter
    double getLuas(){
        return this.luas;
    }
    double getKeliling(){
        return this.keliling;
    }

    // method dengan parameter dan return
    String tampilkanInfo(String namaBangun){
        return "Bangun Datar: " + namaBangun + "Panjang: " + panjang 
        + "Lebar: " + lebar;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Instansi 
        BangunDatar bdr_1 = new BangunDatar(5, 3);

        // memanggil method menghitungLuar & menghitungKeliling
        bdr_1.menghitungLuas();
        bdr_1.menghitungKeliling();

        // memanggil method setPanjang & setLebar
        bdr_1.setLebar(7);
        bdr_1.setLebar(4);
        // cetak setelah ubah panjang dan lebar
        bdr_1.menghitungLuas();
        bdr_1.menghitungKeliling();

        // memanggil method getLuas & getKeliling
        double luasPersegiPanjang = bdr_1.getLuas();
        double kelilingPersegiPanjang = bdr_1.getKeliling();
        System.out.println("Luas : " + luasPersegiPanjang);
        System.out.println("Keliling : " + kelilingPersegiPanjang);

        // memanggil method tampilkanInfo
        String infoBangun = bdr_1.tampilkanInfo("Persegi Panjang");
        System.out.println(infoBangun);
    }
}
