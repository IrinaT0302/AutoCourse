package module_2;
import java.util.Scanner;


//Задача 3
//Из двух чисел с разной четностью, вывести на экран нечетное число.
//Пользователь вводит четное и нечетное число. Последовательность их ввода может быть любой.
//*Пользователь не может ввести меньше 2 чисел, в противном случае выводить об этом сообщение.

        public class task_3a {
            public static void main(String[] args) {

                int d, e;
                Scanner scan = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                d = scan.nextInt();
                System.out.print("Введите второе число: ");
                e = scan.nextInt();

                    if ((d % 2) == 0) ;
                    System.out.println("Число " + d + " четное ");
                    if ((d % 2) != 0) ;
                    System.out.println("Число " + d + " нечетное ");
                    if ((e % 2) == 0) ;
                    System.out.println("Число " + e + " четное ");
                    if ((e % 2) != 0) ;
                    System.out.println("Число " + e + " нечетное ");
                    if (e == 0);
                    System.out.println();

            }
        }