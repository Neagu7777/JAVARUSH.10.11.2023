import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
18+
Введи с клавиатуры имя и возраст. Если возраст меньше 18, выведи надпись: «Подрасти еще».

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18, вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18, ничего не выводить.
*/

public class Solution10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}

