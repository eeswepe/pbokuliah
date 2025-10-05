public class Hewan {

  private String nama;
  protected int umur;

  public Hewan(String nama, int umur){
    this.nama = nama;
    this.umur = umur;
  }

  public void berjalan(){
    System.out.println(nama + " Sedang Berjalan");
  }

  public void info(){
    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur);
  }

  public String getNama(){
    return this.nama;
  }
}
