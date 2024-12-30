package COM.Tutorial;

class Karyawan extends Manusia {
    private String NamaKar;
    public void setNama(String Nama){
        this.NamaKar = Nama;
    }
    public String getNama(){
        return "Nama Karyawan:" + NamaKar;
    }
    
}
