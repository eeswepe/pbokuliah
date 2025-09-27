public class ProgramStudi {
  private String kode;
  private String namaProdi;
  private Dosen kaprodi;
  private Mahasiswa[] daftarMahasiswa;
  private int jumlahMahasiswa = 0;

  public ProgramStudi(String kode, String namaProdi, int kuota) {
    this.kode = kode;
    this.namaProdi = namaProdi;
    this.daftarMahasiswa = new Mahasiswa[kuota];
  }

  public void setKaprodi(Dosen dosen) {
    this.kaprodi = dosen;
  }

  public Dosen getKaprodi() {
    return kaprodi;
  }

  public void addMahasiswa(Mahasiswa mahasiswa) {
    if (jumlahMahasiswa < daftarMahasiswa.length) {
      this.daftarMahasiswa[jumlahMahasiswa] = mahasiswa;
      jumlahMahasiswa++;
    } else {
      System.out.println("Kuota mahasiswa untuk prodi " + namaProdi + " sudah penuh.");
    }
  }

  public void info() {
    System.out.println("Kode Prodi: " + kode);
    System.out.println("Nama Prodi: " + namaProdi);
    if (kaprodi != null) {
      System.out.println("Kaprodi: " + kaprodi.getNama());
    }
    System.out.println("Daftar Mahasiswa:");
    for (int i = 0; i < jumlahMahasiswa; i++) {
      System.out.println(daftarMahasiswa[i].info());
    }
    System.out.println();
  }
}
