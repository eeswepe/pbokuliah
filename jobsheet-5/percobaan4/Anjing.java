public class Anjing extends Mamalia{
  String warna;
  public Anjing(String nama, int umur, String warna){
    super(nama, umur);
    this.warna = warna;
  }

  public void menggonggong(){
    System.out.println("Guk!");
  }
  
}
