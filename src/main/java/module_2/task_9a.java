package module_2;
import java.util.Scanner;
import static java.lang.Math.min;

//Задача 9.1
//Определить какое из трех, введенных пользователем, чисел минимальное и вывести его на экран.

    public class task_9a {
            public static void main(String[] args) {
                int a, b, c;
                Scanner scan = new Scanner(System.in);

                System.out.print("Введите три числа через пробел: ");
                a = scan.nextInt();
                b = scan.nextInt();
                c = scan.nextInt();

                System.out.println("Минимальное число: " + min(min(a, b), c));
            }
        }
