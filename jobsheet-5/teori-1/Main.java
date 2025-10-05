public class Main {
  public static void main(String[] args) {
    SistemInformasiTataTertib sistem = new SistemInformasiTataTertib();

    Mahasiswa mhs1 =
        new Mahasiswa("Singgih Wahyu Permana", "M001", "2351502001", "Teknik Informatika");
    Mahasiswa mhs2 = new Mahasiswa("Savero Athallah", "M002", "2351504002", "Sistem Informasi");
    Dosen dosen1 =
        new Dosen("Dr. Ir. Suryo Adi", "D101", "198001012005011001", "Departemen Elektro");

    TataTertib tatib1 =
        new TataTertib(
            "Dilarang merokok di dalam area gedung.", "Teguran lisan dan denda Rp 50.000");
    TataTertib tatib2 =
        new TataTertib("Terlambat mengumpulkan tugas.", "Pengurangan nilai sebesar 20%");
    TataTertib tatib3 =
        new TataTertib("Parkir kendaraan tidak pada tempatnya.", "Peringatan tertulis");

    System.out.println("=== MEMULAI SIMULASI PENCATATAN PELANGGARAN ===\n");

    Pelanggaran p1 = new Pelanggaran(mhs1, tatib1, "2025-10-01");
    sistem.catatPelanggaran(p1);

    Pelanggaran p2 = new Pelanggaran(mhs2, tatib2, "2025-10-03");
    sistem.catatPelanggaran(p2);

    Pelanggaran p3 = new Pelanggaran(dosen1, tatib3, "2025-10-04");
    sistem.catatPelanggaran(p3);

    Pelanggaran p4 = new Pelanggaran(mhs1, tatib2, "2025-10-05");
    sistem.catatPelanggaran(p4);

    System.out.println("\n=== SIMULASI SELESAI ===\n");

    sistem.lihatRiwayatPelanggaran(mhs1);
    sistem.lihatRiwayatPelanggaran(mhs2);
    sistem.lihatRiwayatPelanggaran(dosen1);
  }
}
