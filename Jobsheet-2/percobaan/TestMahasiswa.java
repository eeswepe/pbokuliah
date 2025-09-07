public class TestMahasiswa {
  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.nim = 101;
    mhs1.nama = "Lestari";
    mhs1.alamat = "Jl. Violina No 1A";
    mhs1.kelas = "1A";

    Mahasiswa mhs2 = new Mahasiswa();
    mhs2.nim = 102;
    mhs2.nama = "Budi";
    mhs2.alamat = "Jl. Piano No 2B";
    mhs2.kelas = "1B";

    Mahasiswa mhs3 = new Mahasiswa();
    mhs3.nim = 103;
    mhs3.nama = "Citra";
    mhs3.alamat = "Jl. Gitar No 3C";
    mhs3.kelas = "1C";

    mhs1.tampilBiodata();
  }
}
