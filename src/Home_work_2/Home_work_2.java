package Home_work_2;

public class Home_work_2 {
    public static void main (String[] args) {
        System.out.println(method_1(7, 2));
        method_2(-5);
        System.out.println(method_3(-7));
        method_4("Привет", 7);
        System.out.println(method_5 (4));

    }
    //Задание №1//
    public static boolean method_1 (int a, int b) {
        return a+b>=10 && a+b<=20;
    }
    //Задание №2//
    public static void method_2 (int a) {
        if (a>=0) {
            System.out.println("Число положительное");
        }
        if (a<0) {
            System.out.println("Число отрицательное");
        }
    }
    //Задание №3//
    public static boolean method_3 (int a) {
        if (a<0) {
            return true;
        }
        return false;
    }
    //Задание №4//
    public static void method_4 (String word, int a) {
        for (a =0; a<3; a++) {
            System.out.println(word);
        }
        System.out.println();
    }
    //Задание №5//
    public static boolean method_5 (int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }
}
