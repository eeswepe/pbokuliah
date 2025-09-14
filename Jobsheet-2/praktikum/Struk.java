public class Struk {

  public String penyewa;
  public String game;
  public int totalHarga;

  public void catatTransaksi(int lamaHari, Game game, Member member) {
    this.penyewa = member.namaMember;
    this.game = game.namaGame;
    this.totalHarga = (game.harga * lamaHari);

    System.out.println("Penyewa    : " + this.penyewa);
    System.out.println("Game       : " + this.game);
    System.out.println("Total Harga: " + this.totalHarga);
  }
}
