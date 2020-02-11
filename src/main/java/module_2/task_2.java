package module_2;
import java.util.Scanner;

//Задача 2
//Обменять значения двух переменных, используя третью (буферную) переменную.

    public class task_2 {
        public static void main(String[] args) {

            int d, e, f;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            d = scan.nextInt();
            System.out.print("Введите второе число: ");
            e = scan.nextInt();
            System.out.println("Поменять значение " + d + " cо значением " + e);
            f = d;
            d = e;
            e = f;
            System.out.println("Первое число: " + d);
            System.out.println("Второе число: " + e);
        }
    }
