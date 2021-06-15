package src.Tugas.Komponen;

public class Ruangan {
    String tempat;
    
    public Ruangan(String tempat){
        this.tempat=tempat;
    }

    @Override
    public String toString() {
        return 
             getTempat() 
            ;
    }

    public String getTempat() {
        return this.tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

}
