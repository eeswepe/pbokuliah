public class Persegi {
  public int sisi;

  public void dataPersegi() {
    System.out.println("Panjang sisi persegi: " + sisi);
  }

  public int luasPersegi() {
    return sisi * sisi;
  }

  public int kelilingPersegi() {
    return sisi * 4;
  }
}
