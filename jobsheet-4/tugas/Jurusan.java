public class Jurusan {
  private String namaJurusan;
  private ProgramStudi[] daftarProdi;

  public Jurusan(String nama, int jumlahProdi) {
    this.namaJurusan = nama;
    this.daftarProdi = new ProgramStudi[jumlahProdi];
  }

  public void setNamaJurusan(String namaJurusan) {
    this.namaJurusan = namaJurusan;
  }

  public String getNamaJurusan() {
    return this.namaJurusan;
  }

  public void addProdi(ProgramStudi prodi, int index) {
    if (index >= 0 && index < daftarProdi.length) {
      this.daftarProdi[index] = prodi;
    } else {
      System.out.println("Index di luar batas.");
    }
  }

  public void info() {
    System.out.println("========================================");
    System.out.println("Jurusan: " + namaJurusan);
    System.out.println("----------------------------------------");
    System.out.println("Daftar Program Studi:");
    for (ProgramStudi prodi : daftarProdi) {
      if (prodi != null) {
        prodi.info();
      }
    }
    System.out.println("========================================");
  }
}
