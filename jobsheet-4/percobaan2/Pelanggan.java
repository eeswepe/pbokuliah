public class Pelanggan {
  private String nama;
  private Mobil mobil;
  private Sopir sopir;
  private int hari;

  Pelanggan(){}

  public void setNama(String nama){
    this.nama = nama;
  }

  public String getNama(){
    return this.nama;
  }

  public void setMobil(Mobil mobil){
    this.mobil = mobil;
  }

  public Mobil getMobil(){
    return this.mobil; 
  }

  public void setSopir(Sopir sopir){
    this.sopir = sopir;
  }

  public Sopir getSopir(){
    return this.sopir;
  }

  public void setHari(int hari){
    this.hari = hari;
  }

  public int getHari(){
    return this.hari;
  }

  public int hitungBiayaTotal(){
    return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
  }
}
