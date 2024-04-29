import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Fruit fruit1 = new Fruit ("Mela");
Fruit fruit2 = new Fruit ("Arancia");
Fruit fruit3 = new Fruit ("Fragola");
Fruit fruit4 = new Fruit ("Lamponi");

LinkedList<Fruit> list = new LinkedList<>();
list.add(fruit1);
list.add(fruit2);
System.out.println("list is: " + list);

list.addFirst(fruit4);
list.addLast(fruit3);
System.out.println("list updated is: " + list);

    }
}