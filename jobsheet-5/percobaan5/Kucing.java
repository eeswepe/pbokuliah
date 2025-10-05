public class Kucing extends Hewan{
  String warnaBulu;
  public Kucing(String nama, int umur, String warnaBulu){
    super(nama, umur);
    this.warnaBulu = warnaBulu;
  }


  public void info(){
    super.info();
    System.out.println("Warna Bulu: " + warnaBulu);
  }
}
