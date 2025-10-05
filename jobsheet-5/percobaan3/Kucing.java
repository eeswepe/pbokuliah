public class Kucing extends Hewan{
  String rass;
  public Kucing(String nama, int umur, String rass){
    super(nama, umur);
    this.rass = rass;
    System.out.println("Konstruktor Kucing Dipanggil");
  }  

  public void getInfo(){
    System.out.printf("Kucing bernama %s dengan rass %s sudah berumur %d tahun", nama, rass, umur);
  }
}
