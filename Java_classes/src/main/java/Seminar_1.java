import java.util.Scanner;
public class Seminar_1 {
    public static void main(String[] args){
//        int i = 6; //32 bit целое
//        long l; //64bit целое
//        short s; //
//        byte aByte;
//        char ch = 'r';
//        float f; //
//        double d; // 32 bit дробное
//        boolean b; // 64 bit дробное
//
//        //-----------------------------
//
//        int[] ints = {1,2,3,4}; // or // int[] ints = new int[5];
//        String str = "Hello, World!";
//        String str2 = "Hello, World!";
//        str += "?";
//        System.out.println(str + " " + i + ", штук");
//
//
//        int[] tmp = new int[ints.length + 10];
//        for (int j=0; j< ints.length; j++) {
//            tmp[j] = ints[j];
//        }
//        ints = tmp;
//
//        if(str == str2) System.out.println(true); // if(str.equals(str2)) System.out.println(true)
//        if(str != str2) System.out.println(false);
//
//        i=0;
//        for (int j=0;j<10;j++, i+=j);
//        System.out.println(i);


//        1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//        2) Вывести все простые числа от 1 до 1000
//        3) Реализовать простой калькулятор
//        4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
//        Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить
//        выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

//        int n = 12;
//        String a = String.valueOf(i);
//        a.length();
//
//        int n = 12;
//        String a = Integer.toBinaryString(i);
//        a.length();


        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите максимальный лимит: ");
        int maxLimit = Integer.parseInt(iScanner.nextLine());
        showSimpleNums(maxLimit);
        iScanner.close();
    }
    private static void showSimpleNums(int maxLimit){
        System.out.print("2 3 5");
        for (int i = 7; i<=maxLimit; i++){
            if (i%2 !=0 && i%3 !=0 && i%5 !=0){
                System.out.print(i + " ");
            }
        }
    }
}






