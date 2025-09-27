public class MainPercobaan1 {

  public static void main(String[] args) {
    Processor p1 = new Processor();
    p1.setMerk("Inter i5");
    p1.setCache(4);

    Laptop l1 = new Laptop();
    l1.setMerk("Thinkpad");
    l1.setProc(p1);
    l1.info();
  }
}
