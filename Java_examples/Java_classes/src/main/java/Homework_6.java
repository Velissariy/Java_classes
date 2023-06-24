import java.util.*;
//Разработать программу, имитирующую поведение коллекции HashSet.
//        В программе создать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества
//        и метод позволяющий читать элементы по индексу.
//        *Реализовать все методы из семинара.
//        Формат данных Integer.

public class Homework_6 {
    private List<Integer> elements;

    public Homework_6() {
        elements = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public String toString() {
        return elements.toString();
    }

    public Integer get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        Homework_6 set = new Homework_6();

        set.add(5);
        set.add(8);
        set.add(3);
        set.add(8);
        set.add(2);

        System.out.println("Множество элементов: " + set.toString());
        System.out.println("Элемент по индексу 2: " + set.get(2));
    }

}
