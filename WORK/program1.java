import java.util.LinkedList;

/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернёет «перевёрнутый» список.
*/

import java.util.ListIterator;

public class program1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Москва");
        ll.add("Дагестан");
        ll.add("Самир");
        ll.add("Сайгид");
        ll.add("Алексей");

        System.out.println(ll);

        System.out.println(list_reverse(ll));
    }

    static LinkedList<String> list_reverse(LinkedList<String> ll) {
        LinkedList<String> ll_reversed = new LinkedList<>();

        ListIterator<String> iterator = ll.listIterator(ll.size());
        while (iterator.hasPrevious()) {
            ll_reversed.add(iterator.previous());
        }

        return ll_reversed;
    }

}