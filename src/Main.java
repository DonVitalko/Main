public class Main {

    public static void main(String[] args) {
        //Второе задание
        byte z = 5;
        short y = 15;
        int x = 24;
        long w = 582;
        float v = 2.4f;
        double u = 12.4;
        char t = '%';
        boolean itTrue = true;


        //Третье задание
        System.out.println(taskTree(1.8f, 2.4f, 2.8f, 1.2f));

        //Четвертое задание
        System.out.println(taskFour(15, 5));

        //Пятое задание
        taskFive(21);

        //Шестое задание
        System.out.println(taskSix(10));

        //Седьмое задание
        taskSeven("Илья");

        //Восьмое задание
        taskEight(2021);
    }

    public static float taskTree(float a, float b, float c, float d) {
        float e;
        e = (a * (b + (c / d)));
        return e;
    }

    public static boolean taskFour(int z, int y) {
        if (z + y <= 20 && z + y >= 10) {
            return (true);
        } else {
            return (false);
        }
    }

    public static void taskFive(int x) {
        if (x >= 0) {
            System.out.println(x + " положительное число.");
        } else {
            System.out.println(x + " отрицательное число.");
        }
    }

    public static boolean taskSix(int w) {
        if (w >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void taskSeven(String v) {
        System.out.println("Привет, " + v + "!");
    }

    public static void taskEight(int year) {
        int result;
        int resultTwo;
        result= year%(4);
        resultTwo= year%(400);
       if ((result==0) || (resultTwo == 0)){
            System.out.println("Високосный год.");
       }else{
            System.out.println("Не високосный год.");
       }
    }
}
