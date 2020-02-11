package module_2;
import java.util.Scanner;

//Задача 7
//Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.

        public class task_7 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите длину стороны треугольника а: ");
                int a = sc.nextInt();
                System.out.println("Введите длину стороны треугольника b: ");
                int b = sc.nextInt();
                System.out.println("Введите длину стороны треугольника c: ");
                int c = sc.nextInt();
                if ((a + b) > c && (a + c) >  b && (b + c) > a){
                System.out.println("Такой треугольник существует: ");
                }
                else System.out.println("Такой треугольник не существует: ");
            }
        }
