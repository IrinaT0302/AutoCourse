package module_2;
import java.util.Scanner;

//Задача 6
//Определить, кратно ли заданное число трем; если нет, вывести остаток.

    public class task_6 {
        public static void main(String[] args) {
            int number;
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите число: ");
            number = scan.nextInt();

            if ((number % 3 == 0)) {
                System.out.println("Число кратно 3.");
            }
            if
                ((number % 3 != 0)) {
                System.out.println("Число не кратно 3.");

            }
        }
    }