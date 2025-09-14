public class Anggota {
  private String idAnggota;
  private String nama;
  private int limit;
  private int totalPinjaman;

  Anggota(String idAnggota, String nama, int limit) {
    this.idAnggota = idAnggota;
    this.nama = nama;
    this.limit = limit;
    this.totalPinjaman = 0;
  }

  public String getNama() {
    return this.nama;
  }

  public int getLimitPinjaman() {
    return this.limit;
  }

  public int getJumlahPinjaman() {
    return this.totalPinjaman;
  }

  public void pinjam(int pinjaman) {
    if (pinjaman + totalPinjaman > limit) {
      System.out.println("Maaf, jumlah pinjaman melebihi limit.");
    } else {
      this.totalPinjaman += pinjaman;
    }
  }

  public void angsur(int angsuran) {
    if (totalPinjaman == 0) {
      System.out.println("Tidak ada pinjaman yang harus diangsur");
      return;
    }
    if (angsuran < totalPinjaman / 10) {
      System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman");
      return;
    }
    if (totalPinjaman - angsuran < 0) {
      System.out.println(
          "Pinjaman lunas, anda menerima kembalian " + (-1 * (totalPinjaman - angsuran)));
      totalPinjaman = 0;
    } else {
      totalPinjaman -= angsuran;
    }
  }
}
