import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackYapisi list = new StackYapisi(5);
        list.push(10);
        list.push(20);
        list.print();
        list.pop();
        list.print();

    }
}