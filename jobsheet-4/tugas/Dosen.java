public class Dosen {
  private String nip;
  private String nama;

  public Dosen(String nip, String nama) {
    this.nip = nip;
    this.nama = nama;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public String getNip() {
    return nip;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public String info() {
    return "NIP: " + nip + "\nNama: " + nama;
  }
}
