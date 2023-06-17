import java.util.*;
//        Организовать вводи и хранение данных пользователей. ФИО возраст и пол
//        1) вывод в формате Фамилия И.О. возраст пол
//        2) добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        3) *реализовать сортировку по возрасту с использованием индексов
//        4) *реализовать сортировку по возрасту и полу с использованием индексов

public class Homework_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Введите ФИО (Фамилия Имя Отчество):");
            String fullName = scanner.nextLine();
            System.out.println("Введите возраст:");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите пол (м/ж):");
            String gender = scanner.nextLine().toLowerCase();

            User user = new User(fullName, age, gender);
            users.add(user);

            System.out.println("Пользователь " + user.getShortName() + " добавлен.");

            System.out.println("Введите 'вывод', чтобы вывести список пользователей,");
            System.out.println("или 'выход', чтобы завершить программу.");
            String command = scanner.nextLine().toLowerCase();
            if (command.equals("выход")) {
                isRunning = false;
            } else if (command.equals("вывод")) {
                System.out.println("Выберите тип сортировки ('возраст' или 'возраст и пол'):");
                command = scanner.nextLine().toLowerCase();
                if (command.equals("возраст")) {
                    Collections.sort(users);
                } else if (command.equals("возраст и пол")) {
                    Collections.sort(users, Comparator.comparing(User::getGender).thenComparing(User::getAge));
                }
                for (User u : users) {
                    System.out.println(u.getShortInfo());
                }
            }
        }
    }
}

class User implements Comparable<User> {
    private String fullName;
    private int age;
    private String gender;

    public User(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getShortName() {
        String[] parts = fullName.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            sb.append(" ").append(parts[i].charAt(0)).append(".");
        }
        return sb.toString();
    }

    public String getShortInfo() {
        return getShortName() + " " + age + " " + gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        return Integer.compare(age, o.age);
    }
}
