public class Anjing extends Hewan{

  private String jenisBulu;

  public Anjing(String nama, int umur, String jenisBulu){
    super(nama, umur);
    this.jenisBulu = jenisBulu;
  }

  public void menggonggong(){
    System.out.println("Guk!");
  }

  public String getJenisBulu(){
    return this.jenisBulu;
  }

}
