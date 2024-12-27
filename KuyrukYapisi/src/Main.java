//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueYapisi kuyruk= new QueueYapisi(5);

        kuyruk.enQueue(10);
        kuyruk.enQueue(20);
        kuyruk.enQueue(30);
        kuyruk.enQueue(40);


        kuyruk.elemanSayisi();

        kuyruk.deQueue();
        kuyruk.elemanSayisi();

        kuyruk.yazdir();



    }
}