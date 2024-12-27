public class Main {
    public static void main(String[] args) {
        BagliListe lt = new BagliListe();

        lt.basaEkle(10);
        lt.basaEkle(20);
        lt.basaEkle(30);
        lt.basaEkle(40);

        lt.yazdir();
        lt.sonaEkle(88);
        lt.yazdir();

        lt.sonSil();
        lt.yazdir();
        lt.basSil();
        lt.yazdir();
        lt.aradanSil(1);
        lt.yazdir();
    }
}