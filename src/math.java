import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class math {
    public static void logik() throws IOException {
        char ch;

        Scanner scan = new Scanner(System.in);
        System.out.println("это калькулятор \n Введи первое число");
        double a = scan.nextInt();
        System.out.println("что нужно сделать? (*) (/) (+) (-)(%)?");
        ch = (char) System.in.read();


        System.out.println("Введите второе число");
        double b = scan.nextInt();

        switch (ch) {
            case '*':
                System.out.println("Ответ" + (a * b));
                break;
            case '/':
                System.out.println("Ответ" + (a / b));
                break;
            case '+':
                System.out.println("Ответ" + (a + b));
                break;
            case '-':
                System.out.println("Ответ" + (a - b));
                break;
            case '%':
                System.out.println(a / 100 * b);


        }
        System.out.println("еще? y(да)/n(выйти)");
        ch = (char) System.in.read();
        if (ch == 'y') {
            logik();
        }
        System.out.println("всего доброго");
    }

}