public class LampuTidur {

  private boolean power;
  private String[] mode = {"Cold", "Warm", "Ambient"};
  private int currentMode = 0;

  public void ubahPower() {
    this.power = !this.power;
  }

  public void ubahMode() {
    this.currentMode += 1;
  }

  public void cetakStatus() {
    System.out.println("Kondisi Lampu: " + (this.power ? "Menyala" : "Mati"));
    System.out.println("Mode Lampu: " + (this.power ? (this.mode[currentMode % 3]) : "Mati"));
  }
}
