//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListeYapisi liste = new ListeYapisi();

        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);
        liste.ekle(55);



        System.out.println();
        liste.yazdir();
    }
}