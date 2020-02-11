package module_2;
import java.util.Scanner;

//Задача 10
//Пользователь вводит число любой длины
//Определить четное или нечетное число.

public class task_10 {
        public static void main(String args[]) {
            int a;
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите число: ");
            a = scan.nextInt();
            if(a % 2 == 0) {
                System.out.println("Число " + a + " четное");
            } else {
                System.out.println("Число " + a + " нечетное");
            }
        }
    }
