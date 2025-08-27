public class Sepeda {
  private String merek;
  private int kecepatan;
  private int gear;

  public void setMerek(String newValue) {
    this.merek = newValue;
  }

  public void gantiGear(int newValue) {
    this.gear = newValue;
  }

  public void tambahKecepatan(int increment) {
    this.kecepatan = this.kecepatan + increment;
  }

  public void rem(int decrement) {
    this.kecepatan = this.kecepatan - decrement;
  }

  public void cetakStatus() {
    System.out.println("Merek: " + this.merek);
    System.out.println("Kecepatan: " + this.kecepatan);
    System.out.println("Gear: " + this.gear);
  }
}
