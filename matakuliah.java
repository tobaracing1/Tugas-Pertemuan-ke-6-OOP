package src.Tugas.Komponen;

public class matakuliah {
    String namaPelajaran;
    String Hari;
    String jam;

    public String getHari() {
        return this.Hari;
    }

    public void setHari(String Hari) {
        this.Hari = Hari;
    }

    public String getJam() {
        return this.jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return 
             "Matakuliah\t: " + getNamaPelajaran() + "\n" + "Tanggal\t\t: " + getHari() + "\n" + "Jam\t\t: " + getJam();
    }

    public String getNamaPelajaran() {
        return this.namaPelajaran;
    }

    public void setNamaPelajaran(String namaPelajaran) {
        this.namaPelajaran = namaPelajaran;
    }
    
    public matakuliah(String namapel , String hari , String jam){
        this.namaPelajaran = namapel;
        this.Hari = hari;
        this.jam= jam;
    }
}
