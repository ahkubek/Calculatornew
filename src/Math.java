import java.io.IOException;
import java.util.Scanner;

public class Math {
    public static void Calc() throws IOException {
        char ch;
        double a;
        double b;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("это калькулятор \n Введи первое число");
            a = scan.nextInt();
            System.out.println("что нужно сделать? (*) (/) (+) (-)(%)?");
            ch = (char) System.in.read();


            System.out.println("Введите второе число");
            b = scan.nextInt();


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

        } while (ch != 'n');
        System.out.println("всего доброго");
    }
}