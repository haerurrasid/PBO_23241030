// membuat class sebagai template
class Mahasiswa{
    // ciri-ciri atau atribut objek
    String nama;
    String NIM;
    String Jurusan;
    double IPK;
    int umur;
}



public class App {
 public static void main(String[] args) throws Exception {
     // instansiasi objek
     Mahasiswa mhs_1 = new Mahasiswa();
     mhs_1.nama = "Rifki Azwari ";
     mhs_1.NIM = "23241037";
     mhs_1.Jurusan = "PTI";
     mhs_1.IPK = 3.90;
     mhs_1.umur = 20;


     // Cetak Objek
     System.err.println("Nama Mahasiswa :" + mhs_1.nama);
     System.err.println("NIm :" + mhs_1.NIM);
     System.err.println("Jurusan :" + mhs_1.Jurusan);
     System.err.println("IPK :" + mhs_1.IPK);
     System.err.println("umur :" + mhs_1.umur);



 }
}
