public class Laptop {
  private String merk;
  private Processor proc;

  public Laptop() {}

  public Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public void setProc(Processor proc) {
    this.proc = proc;
  }

  public String getMerk() {
    return this.merk;
  }

  public Processor getProc() {
    return this.proc;
  }

  public void info() {
    System.out.println("Merk Laptop = " + merk);
    this.proc.info();
  }
}
