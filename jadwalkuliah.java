package src.Tugas.Komponen;

import java.util.ArrayList;

public class jadwalkuliah {
    ArrayList<mahasiswa> Mahasiswa = new ArrayList<mahasiswa>();
    dosen Dosen;
    matakuliah Matakuliah;
    kelas Kelas;
    Ruangan ruangan;

    public Ruangan getRuangan() {
        return this.ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public kelas getKelas() {
        return this.Kelas;
    }

    public void setKelas(kelas Kelas) {
        this.Kelas = Kelas;
    }
    //ruangan


    public jadwalkuliah() {
    }


    public jadwalkuliah(ArrayList<mahasiswa> Mahasiswa, dosen Dosen, matakuliah Matakuliah,kelas Kelas,Ruangan ruang) {
        this.Mahasiswa = Mahasiswa;
        this.Dosen = Dosen;
        this.Matakuliah = Matakuliah;
        this.Kelas=Kelas;
        this.ruangan=ruang;
    }


    public ArrayList<mahasiswa> getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(ArrayList<mahasiswa> Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public dosen getDosen() {
        return this.Dosen;
    }

    public void setDosen(dosen Dosen) {
        this.Dosen = Dosen;
    }

    public matakuliah getMatakuliah() {
        return this.Matakuliah;
    }

    public void setMatakuliah(matakuliah Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public void tambahMahasiswa(mahasiswa mhs){
        Mahasiswa.add(mhs);
    }

    public void tampilkanJadwalKuliah(){
        System.out.println("=============================================================================");
        System.out.println("Jadwal Kuliah :");
        System.out.println(Matakuliah.toString());
        System.out.println("Kelas\t\t: " + Kelas.toString());
        System.out.println("Ruang\t\t: " + ruangan.toString());
        System.out.println("");
        System.out.println("=============================================================================");
        System.out.println("\t Nama \t\t DosenID \t\t Jenis Kelamin ");
        System.out.println( Dosen.toString());
        System.out.println("=============================================================================");
        System.out.println("Daftar Mahasiswa :");
        System.out.println("Nama \t\t\t StudentID \t\t Jenis Kelamin \t\tKelas ");
        for(mahasiswa mhs : Mahasiswa){
            System.out.println(mhs.toString());
        }
        System.out.println("=============================================================================");

    }

}
