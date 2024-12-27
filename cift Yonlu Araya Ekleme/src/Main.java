//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BagliListe lt = new BagliListe();

        lt.basaEkle(10);
        lt.basaEkle(20);
        lt.basaEkle(30);
        lt.basaEkle(40);

        lt.yazdir();
        lt.sonaEkle(88);
        lt.arayaEkle(1,0);
        lt.yazdir();

    }
}