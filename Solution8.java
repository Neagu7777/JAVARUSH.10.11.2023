import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
День недели
Введи с клавиатуры номер дня недели. Далее, в зависимости от номера, выведи одно из названий:
 «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье».
Если введен номер больше 7 или меньше 1, выведи «такого дня недели не существует».

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если введено число от 1 до 7, необходимо вывести день недели.
•	Если введено число, не входящее в интервал от 1 до 7, то вывести уведомление, что такого дня недели не существует.
*/

public class Solution8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(reader.readLine());
        String result = "такого дня недели не существует";

        if (day == 1) {
            result = "понедельник";
        }
        if (day == 2) {
            result = "вторник";
        }
        if (day == 3) {
            result = "среда";
        }
        if (day == 4) {
            result = "четверг";
        }
        if (day == 5) {
            result = "пятница";
        }
        if (day == 6) {
            result = "суббота";
        }
        if (day == 7) {
            result = "воскресенье";
        }

        System.out.println(result);
    }
}

