package src.Tugas.Komponen;

public class mahasiswa {
    /* Nama Mahaiswa */
    String nama;
    /* Nomor induk mahasiswa */    
    String studentID;
    /* Jen is Kelamin jika 1 Wawnita, 0 Pria */
    boolean jenisKelamin;
    /* Kelas dari mahasiswa*/
    String kelasMahasiswa; 

    public String getKelasMahasiswa() {
        return this.kelasMahasiswa;
    }

    public void setKelasMahasiswa(String kelasMahasiswa) {
        this.kelasMahasiswa = kelasMahasiswa;
    }

    public mahasiswa(String nama, String studentID, boolean jenisKelamin,String kelasMahasiswa) {
        this.nama=nama;
        this.studentID = studentID;
        this.jenisKelamin = jenisKelamin;
        this.kelasMahasiswa=kelasMahasiswa;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
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
        return "" +
            " " + getNama() + "\t\t\t" +
            " " + getStudentID() + "\t\t" +
            " " + (isJenisKelamin()==true ? "Wanita":"Pria") + "\t\t\t" + getKelasMahasiswa()
            ;
    }

    
}
