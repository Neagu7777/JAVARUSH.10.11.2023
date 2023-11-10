/*
Хорошо или плохо?
Напиши метод compare(int a), чтобы он:

выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
иначе выводил строку "Число больше или равно 5".
Требования:
•	Программа должна выводить текст на экран.
•	Метод main не должен вызывать System.out.println или System.out.print.
•	Метод main должен вызывать метод compare.
•	Метод compare должен быть void.
•	Метод compare должен выводить текст на экран согласно заданию.
*/

public class Solution5 {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int a) {
        if (a < 5) {
            System.out.println("Число меньше 5");
        } else {
            System.out.println("Число больше или равно 5");
        }
    }
}

