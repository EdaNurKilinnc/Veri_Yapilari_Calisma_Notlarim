//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TekYonluListeYapisi Liste = new TekYonluListeYapisi();
        Liste.basaekle(10);
        Liste.basaekle(20);
        Liste.basaekle(30);
        Liste.basaekle(40);

        Liste.sondanil();



        Liste.yazdir();




    }
}