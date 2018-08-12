/**
 *HomeWork Java 1 lesson 1
 *
 * author: Nesterov Anatoly
 * version: 11.08.18.
 */

public class Lesson1 {
    public static void main(String[]args){
// 2) Переменные
        byte a = 127;
        short b = -32768;
        int c = 2147483647;
        long d = -9223372036854775808L;
        float e = 99.99f;
        double f = 999.99;
        char g = 'A';
        boolean bool = true;

        System.out.println (add(2, 3, 4, 5));
        System.out.println (checksum(5, 7));
        checknumber(-6);
        System.out.println (checknum (-9));
        ih ("Sergey");
        checkYear(1988);
      //  checkCase(400);



    }
//  Попытка реализовать код вычисления года на Switch Case
/*    private static void checkCase(int i) {
        switch (i){
            case (i % 400 == 0):System.out.println("Год Високосный");
                    break;
            case (i % 100 != 0):System.out.println("Год не високосный");
                    break;
            case (i % 4 == 0):System.out.println("Год Високосный");
                    break;

        }
    } */
// 8) Провкрка года
    private static void checkYear(int i) {
        if (i % 400 == 0 && i % 100 != 0 || i % 4 == 0)
            System.out.println("Год Висоскосный");
        else
            System.out.println ("Год не Виссокосный");

    }

    // 7) Возврат имени
    private static void ih(String sergey) {
        System.out.println("Hello " + sergey + ", how are you?");
    }
// 6) Возврат числа
    private static boolean checknum(int i) {
        if (i >= 0)
            return false;
        else
            return true;
    }

// 5) Проверка числа на знак
    public static void checknumber(int input) {
        if (input >= 0) {
            System.out.println("Число Положительное");
        }else{
            System.out.println ("Число Отрицательное");
        }
    }

// 4) Проверка зуммы чисел на соотвествие
    private static boolean checksum(int a, int b) {
        if ((a + b) >= 10 && (a + b) >= 20)
            return true;
        else
            return false;
    }

// 3) Метод вычисления
    private static int add(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

}