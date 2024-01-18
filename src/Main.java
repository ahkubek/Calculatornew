import java.util.*;
public class Main {
            public static void main(String[] args)throws java.io.IOException {
                char ch;


 System.out.println("это калькулятор \n Введи первое число");


                    Scanner scan = new Scanner(System.in);
                    double a = scan.nextInt();
// System.out.println ("Вы ввели "+a);
                    System.out.println("Введите второе число");
                    double b = scan.nextInt();
//System.out.println ("Вы ввели "+b);

                    System.out.println ("что нужно сделать? (*) (/) (+) (-)(%)?");
//int c = scan.nextInt();
                    ch =(char)System.in.read();

                    switch(ch){
                        case '*': System.out.println("Ответ"+(a*b));
                            break;
                        case '/': System.out.println("Ответ"+(a/b));
                            break;
                        case '+': System.out.println("Ответ"+(a+b));
                        break;
                        case '-': System.out.println("Ответ"+(a-b));
                        break;
                        case '%': System.out.println(a/100*b);
                    }

            }
        }