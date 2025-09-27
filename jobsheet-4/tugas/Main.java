public class Main {
  public static void main(String[] args) {
    Jurusan jti = new Jurusan("Jurusan Teknologi Informasi", 2);

    Dosen dosen1 = new Dosen("112233", "Dosen Dummy 1");
    Dosen dosen2 = new Dosen("445566", "Dosen Dummy 2");

    ProgramStudi ti = new ProgramStudi("TI", "Teknik Informatika", 10);
    ti.setKaprodi(dosen1);
    ProgramStudi sib = new ProgramStudi("SIB", "Sistem Informasi Bisnis", 8);
    sib.setKaprodi(dosen2);

    jti.addProdi(ti, 0);
    jti.addProdi(sib, 1);

    Mahasiswa mhs1 = new Mahasiswa("2141720001", "Ani");
    Mahasiswa mhs2 = new Mahasiswa("2141720002", "Bambang");
    Mahasiswa mhs3 = new Mahasiswa("2141720003", "Cici");
    Mahasiswa mhs4 = new Mahasiswa("2141720004", "Dodi");

    ti.addMahasiswa(mhs1);
    ti.addMahasiswa(mhs2);
    sib.addMahasiswa(mhs3);
    sib.addMahasiswa(mhs4);

    jti.info();
  }
}
