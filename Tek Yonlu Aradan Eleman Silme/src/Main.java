//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TekYonluListeYapisi ListeYapisi = new TekYonluListeYapisi();

        ListeYapisi.basaekle(10);
        ListeYapisi.basaekle(20);
        ListeYapisi.basaekle(30);
        ListeYapisi.basaekle(40);

        ListeYapisi.aradanSil(1);
        ListeYapisi.yazdir();

    }
}