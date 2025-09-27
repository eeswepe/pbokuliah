public class Mahasiswa {
  private String nim;
  private String nama;

  public Mahasiswa(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public String getNim() {
    return nim;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public String info() {
    return "  - NIM: " + nim + ", Nama: " + nama;
  }
}
