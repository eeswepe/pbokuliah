public class TampilPersegi {

    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 10;

        persegi.dataPersegi();
        System.out.println("Luas Persegi: " + persegi.luasPersegi());
        System.out.println("Keliling Persegi: " + persegi.kelilingPersegi());
    }
}
