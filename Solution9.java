import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Минимум двух чисел
Введи с клавиатуры два целых числа и выведи на экран минимальное из них. Если два числа равны между собой,
необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
*/

public class Solution9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        int min;
        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        System.out.println(min);
    }
}

