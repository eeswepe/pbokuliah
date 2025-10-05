public class Truk extends Kendaraan{
  int volumeMuatan;

  public Truk(String merk, int tahunProduksi, int volumeMuatan){
    super(merk, tahunProduksi);
    this.volumeMuatan = volumeMuatan;
  }

  @Override
  public void jalankan(){
    System.out.println("Truk " + merk + " berjalan...");
  }

  public void info(){
    super.info();
    System.out.println("Volume Muatan: " + volumeMuatan + " L");
  }
  
}
