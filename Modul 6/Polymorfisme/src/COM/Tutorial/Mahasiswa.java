package COM.Tutorial;

 class Mahasiswa extends Manusia {
    private String NamaMhs;
    public void setNama(String Nama){
        this.NamaMhs = Nama;
        
    }
    public String getNama(){
        return "Nama Mahasiswa:" + NamaMhs;
    }
    
}
