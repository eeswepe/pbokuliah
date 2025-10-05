public class Main {

  public static void main(String[] args) {
    Kucing kucing = new Kucing("Milo", 2);
    kucing.berjalan();
    kucing.menyusui();

    Anjing anjing = new Anjing("Doggy", 3, "Hitam");
    anjing.menggonggong();
    anjing.menyusui();
  }
}
