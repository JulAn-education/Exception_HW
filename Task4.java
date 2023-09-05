package homework_1;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {

    public static void main(String[] args) throws Exception {

        scanStr();

    }
    public static void scanStr() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        if (str.isEmpty()) {
            throw new Exception("Вы ввели пустую строку.");
        } else {
            System.out.println(str);
        }
    }


}
