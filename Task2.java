package homework_1;

//Если необходимо, исправьте данный код.

public class Task2 {
    public static void main(String[] args) {

        try {
            int a = 8;
            int d = 0;
            double catchedRes1 = a / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}