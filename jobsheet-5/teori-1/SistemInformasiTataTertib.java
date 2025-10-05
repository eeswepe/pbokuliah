import java.util.ArrayList;
import java.util.List;

public class SistemInformasiTataTertib {
  private List<Pelanggaran> daftarPelanggaran;

  public SistemInformasiTataTertib() {
    this.daftarPelanggaran = new ArrayList<>();
  }

  public void catatPelanggaran(Pelanggaran pelanggaran) {
    this.daftarPelanggaran.add(pelanggaran);
    System.out.println(
        ">> Pelanggaran berhasil dicatat untuk: " + pelanggaran.getPelanggar().getNama());
  }

  public void lihatRiwayatPelanggaran(AnggotaKampus anggota) {
    System.out.println(
        "\n===== RIWAYAT PELANGGARAN: " + anggota.getNama().toUpperCase() + " =====");
    boolean adaPelanggaran = false;
    for (Pelanggaran p : daftarPelanggaran) {
      if (p.getPelanggar().getId().equals(anggota.getId())) {
        System.out.println("Tanggal      : " + p.getTanggal());
        System.out.println("Pelanggaran  : " + p.getPeraturanDilanggar().getPeraturan());
        System.out.println("Sanksi       : " + p.getPeraturanDilanggar().getSanksi());
        System.out.println("----------------------------------------");
        adaPelanggaran = true;
      }
    }

    if (!adaPelanggaran) {
      System.out.println(
          "Tidak ada riwayat pelanggaran ditemukan untuk " + anggota.getNama() + ".");
      System.out.println("==============================================");
    }
  }
}
