package COM.Tutorial;

public class Main {
    public static void main(String[] args) {

        Manusia mns;

        Mahasiswa mhs = new Mahasiswa();
        mns = mhs;
        mns.setNama("Rifki Azwari");
        System.out.println(mns.getNama());

        Karyawan kar = new Karyawan();
        mns = kar;
        mns.setNama("Hairur Rasid");
        System.out.println(mns.getNama());

    }
}
