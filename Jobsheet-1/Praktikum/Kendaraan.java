public class Kendaraan {
  private String merek;
  private int kapasitasMesin;

  public void setMerek(String newValue) {
    this.merek = newValue;
  }

  public void setKapasitasMesin(int value) {
    this.kapasitasMesin = value;
  }

  public void cetakStatus() {
    System.out.println("Merek: " + this.merek);
    System.out.println("Kapasitas mesin: " + this.kapasitasMesin + " cc");
  }
}
