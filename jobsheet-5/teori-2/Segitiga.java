public class Segitiga extends BangunDatar {
  public float alas;
  public float tinggi;

  public Segitiga(float alas, float tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  @Override
  public float luas() {
    return 0.5f * this.alas * this.tinggi;
  }

  @Override
  public float keliling() {
    float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
    return this.alas + this.tinggi + sisiMiring;
  }
}
