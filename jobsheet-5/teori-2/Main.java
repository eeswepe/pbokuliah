public class Main {
  public static void main(String[] args) {
    BangunDatar persegiPanjang = new PersegiPanjang(10, 5);
    BangunDatar lingkaran = new Lingkaran(7);
    BangunDatar segitiga = new Segitiga(6, 8);

    System.out.println("## Hasil Perhitungan Bangun Datar ##");

    System.out.println("\n--- Persegi Panjang ---");
    System.out.println("Luas: " + persegiPanjang.luas());
    System.out.println("Keliling: " + persegiPanjang.keliling());

    System.out.println("\n--- Lingkaran ---");
    System.out.println("Luas: " + lingkaran.luas());
    System.out.println("Keliling: " + lingkaran.keliling());

    System.out.println("\n--- Segitiga Siku-Siku ---");
    System.out.println("Luas: " + segitiga.luas());
    System.out.println("Keliling: " + segitiga.keliling());
  }
}
