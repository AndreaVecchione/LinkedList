import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //creo degli oggetti che andrò poi a mettere all'interno della lista
Fruit fruit1 = new Fruit ("Mela");
Fruit fruit2 = new Fruit ("Arancia");
Fruit fruit3 = new Fruit ("Fragola");
Fruit fruit4 = new Fruit ("Lamponi");

//Creo la lista Linkedlist dove andrò a inserirmi i primi oggetti

LinkedList<Fruit> list = new LinkedList<>();
list.add(fruit1);
list.add(fruit2);
System.out.println("lista e: " + list);

//aggiorno la lista, aggiungendo al primo e all'ultimo posto altri oggetti

list.addFirst(fruit4);
list.addLast(fruit3);
System.out.println("list aggiornata e: " + list);

    }
}
