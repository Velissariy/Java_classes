import java.util.ArrayList;
import java.util.Random;

public class Homework_1 {

//Задание
//        Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//        Пункты реализовать в методе main
//                *Пункты реализовать в разных методах
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
        public static void main(String[] args){

            int i = new Random().nextInt(2000); // Случайное целое число в диапазоне от 0 до 2000
            int n = Integer.SIZE - Integer.numberOfLeadingZeros(i); // Сохранение в n номер старшего значащего бита выпавшего числа

            ArrayList<Integer> m1 = new ArrayList<>();
            for (int j=i; j <= Short.MAX_VALUE; j++){
                if (j % n==0){
                    m1.add(j); // Нашли все кратные n числа в диапазоне от i до Short.MAX_VALUE  и добавили в массив m1
                }
            }

            ArrayList<Integer>m2 = new ArrayList<>();
            for (int j = Short.MIN_VALUE; j < i; j++) {
                if (j % n != 0) {
                    m2.add(j); // Нашли все некратные n числа в диапазоне от i до Short.MIN_VALUE  и добавили в массив m2
                }
            }
            System.out.println("i = " + i);
            System.out.println("n = " + n);
            System.out.println("m1 = " + m1);
            System.out.println("m2 = " + m2);
        }

}
