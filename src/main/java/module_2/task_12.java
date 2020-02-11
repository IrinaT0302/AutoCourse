package module_2;

//Задача 12
//Написать метод вычисляющий и возвращающий факториал числа.
//тест: 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040

    public class task_12 {
        static int calculateFactorial(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
            return result;
        }

        public static void main(String[] args){
            System.out.println(calculateFactorial(7));
        }
    }
