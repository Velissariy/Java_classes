import java.util.*;
//        Реализуйте структуру телефонной книги с помощью HashMap.
//        Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с
//        разными телефонами, их необходимо считать, как одного человека с разными телефонами.
//        Вывод должен быть отсортирован по убыванию числа телефонов.

public class Homework_5 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавление контактов в телефонную книгу
        addContact(phoneBook, "Jonhy", "+79992223344");
        addContact(phoneBook, "Jonhy", "+79992211111");
        addContact(phoneBook, "Bobby", "+79994455662");
        addContact(phoneBook, "Bobby", "+79994465742");
        addContact(phoneBook, "Jonhy", "+79994477799");
        addContact(phoneBook, "Антон", "+79955566771");

        // Вывод телефонной книги в порядке убывания числа телефонов
        printPhoneBook(phoneBook);
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phone) {
        if (phoneBook.containsKey(name)) {
            List<String> phones = phoneBook.get(name);
            phones.add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    public static void printPhoneBook(Map<String, List<String>> phoneBook) {
        // Создание списка записей из телефонной книги
        List<Map.Entry<String, List<String>>> entries = new ArrayList<>(phoneBook.entrySet());


        entries.sort((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()));

        // Вывод телефонной книги
        for (Map.Entry<String, List<String>> entry : entries) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones);
        }
    }
}
