public class Penumpang {

  private String ktp;
  private String nama;

  Penumpang(String ktp, String nama){
    this.ktp = ktp;
    this.nama = nama;
  }

  public void setKtp(String ktp){
    this.ktp = ktp;
  }

  public String getKtp(){
    return this.ktp;
  } 

  public void setNama(String nama){
    this.nama = nama;
  }

  public String getNama(){
    return this.nama;
  }

  public String info(){
    String info = "";
    info += "KTP: " + this.ktp + "\n";
    info += "Nama: " + this.nama + "\n";
    return info;
  }

}
