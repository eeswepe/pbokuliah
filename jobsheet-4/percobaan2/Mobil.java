public class Mobil {
  private String nama;
  private int biaya;

  Mobil(){}

  public void setNama(String nama){
    this.nama = nama;
  }

  public String getNama(){
    return this.nama;
  }

  public void setBiaya(int biaya){
    this.biaya = biaya;
  }

  public int getBiaya(){
    return this.biaya;
  }

  public int hitungBiayaMobil(int hari){
    return biaya * hari;
  }
}
