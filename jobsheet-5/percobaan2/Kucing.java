public class Kucing extends Hewan{

  public Kucing(String nama){
    super(nama);
  }

  @Override
  public void bersuara(){
      System.out.println("Meong!");
  }

  public void mengeong(){
    System.out.println("Meong!");
  }
  
}
