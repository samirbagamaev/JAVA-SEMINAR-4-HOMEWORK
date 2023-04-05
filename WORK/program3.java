/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор
*/


import java.util.LinkedList;
import java.util.Random;

public class program3{
    public static void main(String[] args) {
        LinkedList<Integer> ll = createList();
        
        System.out.println(ll);
        System.out.println(sumList(ll));
    }


    //СОЗДАЛИ СПИСОК
    static LinkedList<Integer> createList() {
        Random rnd = new Random();
        int size = rnd.nextInt(69);
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int item = rnd.nextInt(69);
            ll.add(item);
        }
        return ll;
    }

    //НАХОЖДЕНИЕ СУММЫ
    static int sumList(LinkedList<Integer> ll) {
        int sum = 0;
        for (int item : ll) {
            sum += item;
        }
        return sum;
    }

}