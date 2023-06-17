import java.util.*;
//**Задание**
//        Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение
public class Homework_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Random().nextInt(1000));
        numbers.add(new Random().nextInt(1000));
        numbers.add(new Random().nextInt(1000));
        numbers.add(new Random().nextInt(1000));
        numbers.add(new Random().nextInt(1000));
        numbers.add(new Random().nextInt(1000));

        numbers.removeIf(n -> n % 2 == 0); // Удаление четных чисел

        int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0); // Нахождение минимального значения

        int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0); // Нахождение максимального значения

        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0); // Нахождение среднего значения

        System.out.println("Список после удаления чётных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + avg);
    }
}

