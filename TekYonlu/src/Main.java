 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TekYonluListeYapisi List = new TekYonluListeYapisi();

        List.basaekle(10);
        List.basaekle(20);
        List.basaekle(30);

        List.arayaelemanekle(1,11);

        List.yazdir();

    }
}