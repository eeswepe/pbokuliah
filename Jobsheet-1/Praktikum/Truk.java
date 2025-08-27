public class Truk extends Kendaraan {
  private int volumeMuatan;
  private String isiMuatan;

  public void setVolumeMuatan(int value) {
    this.volumeMuatan = value;
  }

  public void setIsiMuatan(String value) {
    this.isiMuatan = value;
  }

  public void cetakStatus() {
    super.cetakStatus();
    System.out.println("Volume muatan: " + this.volumeMuatan + " L");
    System.out.println("Isi Muatan: " + this.isiMuatan);
  }
}
