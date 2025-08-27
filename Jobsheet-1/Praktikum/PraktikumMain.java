public class PraktikumMain {

  public static void main(String[] args) {
    System.out.println("=== Lampu ===");
    LampuTidur lampu = new LampuTidur();
    lampu.ubahPower();
    lampu.cetakStatus();
    lampu.ubahMode();
    lampu.cetakStatus();

    System.out.println("\n=== Dispenser ===");
    Dispenser dispenser = new Dispenser();
    dispenser.chargeBaterai(10);
    dispenser.cetakStatus();
    dispenser.ubahPower();
    dispenser.cetakStatus();

    System.out.println("\n=== Kendaraan ===");
    Kendaraan motor = new Kendaraan();
    motor.setMerek("Beat");
    motor.setKapasitasMesin(125);
    motor.cetakStatus();

    System.out.println("\n=== Mobil ===");
    Mobil mobil = new Mobil();
    mobil.setMerek("Panther");
    mobil.setKapasitasMesin(1200);
    mobil.setJmlPenumpang(8);
    mobil.setBBM("Solar");
    mobil.cetakStatus();

    System.out.println("\n=== Truk ===");
    Truk truk = new Truk();
    truk.setMerek("Traga");
    truk.setKapasitasMesin(2000);
    truk.setVolumeMuatan(300);
    truk.setIsiMuatan("Sayur Segar");
    truk.cetakStatus();
  }
}
