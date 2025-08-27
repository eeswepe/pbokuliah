public class Mobil extends Kendaraan {
  private int jmlPenumpang;
  private String jenisBBM;

  public void setJmlPenumpang(int value) {
    this.jmlPenumpang = value;
  }

  public void setBBM(String newValue) {
    this.jenisBBM = newValue;
  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Jumlah Penumpang: " + this.jmlPenumpang);
    System.out.println("Jenis BBM: " + this.jenisBBM);
  }
}
