public class SepedaGunung extends Sepeda {
  private String tipeSuspensi;

  public void setTipeSuspensi(String newValue) {
    this.tipeSuspensi = newValue;
  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Tipe suspensi: " + this.tipeSuspensi);
  }
}
