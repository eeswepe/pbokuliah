public class Main {

  public static void main(String[] args) {
    Kucing kucing = new Kucing("Milo", 2, "Oranye");
    kucing.info();
    kucing.berjalan();

    // System.out.println(kucing.nama); ini error
    System.out.println(kucing.getNama());
    System.out.println(kucing.umur);

    Anjing anjing = new Anjing("Doggy", 4, "Halus");
    anjing.menggonggong();
    anjing.getJenisBulu();
  }
}
