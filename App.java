package src.Tugas.Komponen;
import src.Tugas.Komponen.*;

public class App {
    public static void main(String[] args) throws Exception {
        mahasiswa mhs1 = new mahasiswa("Clavin", "01210121",false,"20TI2");
        mahasiswa mhs2 = new mahasiswa("Sri", "01210121",true,"20TI2");
        mahasiswa mhs3 = new mahasiswa("Elvia", "01210121",true,"20TI2");
        dosen Dosen = new dosen("Ade Maulana", "02020234", false);
        matakuliah Matkul = new matakuliah("Object Oriented Programming","Selasa,06-15-2021","17.30 - 20.00");
        kelas Kelas = new kelas("20TI2");
        Ruangan ruang = new Ruangan("Microsoft Teams");

        jadwalkuliah JadwalKuliah = new jadwalkuliah();
        JadwalKuliah.tambahMahasiswa(mhs1);
        JadwalKuliah.tambahMahasiswa(mhs2);
        JadwalKuliah.tambahMahasiswa(mhs3);
        JadwalKuliah.setDosen(Dosen);
        JadwalKuliah.setMatakuliah(Matkul);
        JadwalKuliah.setKelas(Kelas);
        JadwalKuliah.setRuangan(ruang);
        JadwalKuliah.tampilkanJadwalKuliah();
        System.out.println("===End===");

    }
}

