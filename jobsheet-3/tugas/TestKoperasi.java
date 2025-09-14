import java.util.Scanner;

public class TestKoperasi {
  public static Anggota donny = new Anggota("111333444", "Donny", 5000000);

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int pilihan;

    while (true) {
      System.out.println("\n--- MENU KOPERASI ---");
      System.out.println("Anggota: " + donny.getNama());
      System.out.println("1. Lihat Jumlah Pinjaman");
      System.out.println("2. Ajukan Pinjaman Baru");
      System.out.println("3. Bayar Angsuran");
      System.out.println("4. Lihat Limit Pinjaman");
      System.out.println("5. Keluar");
      System.out.print("Masukkan pilihan Anda (1-5): ");

      pilihan = scanner.nextInt();

      switch (pilihan) {
        case 1:
          lihatPinjaman();
          break;
        case 2:
          ajukanPinjaman(scanner);
          break;
        case 3:
          bayarAngsuran(scanner);
          break;
        case 4:
          lihatLimit();
          break;
        case 5:
          System.out.println("Terima kasih telah menggunakan layanan kami.");
          scanner.close();
          System.exit(0);
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan coba lagi.");
      }
    }
  }

  public static void lihatPinjaman() {
    System.out.println("\n-----------------------------------------");
    System.out.println("Jumlah pinjaman saat ini: Rp " + donny.getJumlahPinjaman());
    System.out.println("-----------------------------------------");
  }

  public static void ajukanPinjaman(Scanner scanner) {
    System.out.print("Masukkan jumlah uang yang ingin dipinjam: Rp ");
    int jumlah = scanner.nextInt();
    donny.pinjam(jumlah);
    lihatPinjaman();
  }

  public static void bayarAngsuran(Scanner scanner) {
    System.out.print("Masukkan jumlah angsuran yang ingin dibayar: Rp ");
    int jumlah = scanner.nextInt();
    donny.angsur(jumlah);
    lihatPinjaman();
  }

  public static void lihatLimit() {
    System.out.println("\n-----------------------------------------");
    System.out.println("Limit pinjaman Anda adalah: Rp " + donny.getLimitPinjaman());
    System.out.println("-----------------------------------------");
  }
}
