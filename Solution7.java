import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
Введи с клавиатуры число. Если число положительное, увеличь его в два раза. Если число отрицательное,
прибавь единицу.
Если введенное число равно нулю, выведи число ноль.
Выведи результат на экран.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить число на экран.
•	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
•	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
•	Если введенное число равно нулю, необходимо вывести число ноль.
*/

public class Solution7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        }
        System.out.println(number);
    }
}

