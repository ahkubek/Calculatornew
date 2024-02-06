import java.io.IOException;
import java.util.Scanner;

public class Logic {
    public static void calc() throws IOException {
        char ch;
        double firstNumber;
        double secondNumber;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("это калькулятор \n Введи первое число");
            firstNumber = scan.nextInt();
            System.out.println("что нужно сделать? (*) (/) (+) (-)(%)?");
            ch = (char) System.in.read();


            System.out.println("Введите второе число");
            secondNumber = scan.nextInt();


            switch (ch) {
                case '*':
                    System.out.println("Ответ" + (firstNumber * secondNumber));
                    break;
                case '/':
                    System.out.println("Ответ" + (firstNumber / secondNumber));
                    break;
                case '+':
                    System.out.println("Ответ" + (firstNumber + secondNumber));
                    break;
                case '-':
                    System.out.println("Ответ" + (firstNumber - secondNumber));
                    break;
                case '%':
                    System.out.println(firstNumber / 100 * secondNumber);


            }

            System.out.println("еще? y(да)/n(выйти)");
            ch = (char) System.in.read();

        } while (ch != 'n');
        System.out.println("всего доброго");
    }
}