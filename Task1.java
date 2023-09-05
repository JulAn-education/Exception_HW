package homework_1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
//у пользователя ввод данных.


public class Task1 {


    public static void main(String[] args) {

        number();

    }

    public static void number() {
        float num = 0;
        boolean run = true;
        while (run) {
            run = false;
            System.out.println("Введите дробное число");
            Scanner sc = new Scanner(System.in);
            try {
                num = sc.nextFloat();

            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Попробуйте снова.");
                run = true;
            }
            System.out.println("Введеное число " + num);
        }

    }

}








