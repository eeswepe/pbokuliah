public class Dispenser {

  private int baterai;
  private boolean power;

  public void chargeBaterai(int menit) {
    this.baterai += (5 * menit);
  }

  public void ubahPower() {
    this.power = !this.power;
    this.baterai -= 2;
  }

  public void cetakStatus() {
    System.out.println("Kondisi Dispenser: " + (this.power ? "Menyala" : "Mati"));
    System.out.println("Sisa Baterai: " + this.baterai);
  }
}
