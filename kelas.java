package src.Tugas.Komponen;

public class kelas {
    String nama;

    @Override
    public String toString() {
        return 
             getNama() 
            ;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public kelas(String nama){
        this.nama=nama;
    }
}
