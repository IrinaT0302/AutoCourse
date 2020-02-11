package module_2;
import java.util.Scanner;

//Задача 5
//Определить количество дней в году, который вводит пользователь.
//В високосном - 366 дней, в обычном 365.

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        {
            int a;
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите количество дней в году: ");
            a = scan.nextInt();
            {

                if (a % 100 == 0 && a % 400 == 0)
                    System.out.println("количество дней в году: 366");

                else if (a % 4 == 0 && a % 100 > 0)
                    System.out.println("количество дней в году: 366");

                else if (a % 100 == 0)
                    System.out.println("количество дней в году: 365");

                else
                    System.out.println("количество дней в году: 365");
            }
        }
    }
}
