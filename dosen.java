package src.Tugas.Komponen;

public class dosen {
    /* Nama Mahaiswa */
    String nama;
    /* Nomor induk Dosen */    
    String DosenID;
    /* Jen is Kelamin jika 1 Wawnita, 0 Pria */
    boolean jenisKelamin;
    
    public dosen() {
    }

    public dosen(String nama, String studentID, boolean jenisKelamin) {
        this.nama=nama;
        this.DosenID = studentID;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDosenID() {
        return this.DosenID;
    }

    public void setDosenID(String DosenID) {
        this.DosenID = DosenID;
    }

    public boolean isJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Dosen"+" : " +
            " " + getNama() + "\t" +
            " " + getDosenID() + "\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria") 
            ;
    }

    
}
