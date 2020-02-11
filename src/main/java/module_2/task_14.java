package module_2;

//Задача 14
//Дано число. Найти сумму и произведение его цифр.

        public class task_14 {
            public static void main(String[] args) {
                int n = 963;
                int s = 0, m = 1;
                for (int i = 0; i < 3; i++) {
                    m *= n % 10;
                    s += n % 10;
                    n /= 10;
                }
                System.out.println("Сумма: " + s);
                System.out.println("Произведение: " + m);
            }
        }
