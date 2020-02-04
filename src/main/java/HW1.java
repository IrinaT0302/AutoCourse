public class HW1 {
        public static void main(String[] args){

            //ОДНОТИПЫ (арифметические операции)

            int a = 8; //  инициализация переменной
            int b = 13;
            int c = a + b; // инициализация переменной путем сложения
            System.out.println(a + b);
            System.out.println(c-a);
            System.out.println(b * c);
            System.out.println(b/a + " отображается только целая часть");
            System.out.println(b%a); // остаток по модулю

            byte d,e,f,g; //создание переменных без инициализации
            d = 127;      //инициализация переменной числовым значением
            e = 25;
            f = (byte) (d - e);
            g = (byte) (d / e);
            System.out.println(d % e);
            System.out.println(f);
            System.out.println(g);

            short h = 16932;
            short i = -85;
            short j = (short) (h + i);
            System.out.println(j);
            System.out.println(h+i);
            System.out.println(h-i);
            System.out.println(h*i);
            System.out.println(h%i);

            long kkk = -206;
            long lll = kkk + 73;
            long mmm = kkk + lll;
            long nnn = lll/kkk;
            System.out.println(mmm);
            System.out.println(nnn);
            System.out.println((double) lll/kkk);
            System.out.println(kkk%lll);
            System.out.println(kkk-lll);

            //РАЗНЫЕ ТИПЫ (арифметические операции)

            long oo = kkk + b;
            int p = (int) (kkk + b);
            long qq = kkk%b;
            int v = (int) (kkk%b);
            System.out.println(oo);
            System.out.println(p);
            System.out.println(qq);
            System.out.println(v);

            int w = d + b;
            byte x = (byte) (d + b);
            System.out.println (w);
            System.out.println (x);
            System.out.println (d+b);

            short y = (short) (e - b);
            byte z = (byte) (e - y);
            System.out.println(y);
            System.out.println(z);

            double aa  = 2.54;
            double bb = 9.76;
            System.out.println((aa/bb));

            float cc = 1.95f;
            float ee = (float) 8.4;
            float uee = cc*ee;
            System.out.println(uee);


            double lu = uee * f;
            System.out.println((int)uee); // отображается только целая часть
            double ab = a *b;
            double da = a;
            System.out.println(ab);
            System.out.println(da);

            // константы
            final int FIRST = 8;
            final int SECOND = 3;
            //FIRST = 38; - константа неизменна, отображается ошибка
            //SECOND = 83;


            //CHAR - IRINA

            char l1 = 73; //I
            char l2 = 114; //r
            char l3 = 105; //i
            char l4 = 110; //n
            char l5 = 97;  //a
            System.out.println(l1 +""+l2+""+l3+""+l4+""+l5);
            System.out.println(l1+l2+l3+l4+l5);

            // BOOLEAN

            boolean bool = (a<b);
            boolean boolF = (a>b);

            if (bool){
                System.out.println("Выражение a<b верно");
            }

            if (boolF){
                System.out.println("Выражение a<b неверно");
            }
        }
    }
