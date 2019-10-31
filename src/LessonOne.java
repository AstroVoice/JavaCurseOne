/*
 * 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
 * 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
 * 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
 * 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
 * 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
 * 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
 * 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
 * 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
 */
public class LessonOne {

    //Задание 1
    public static void main(String[] args) {
        //Задание 2
        initVariable2();
        //Задание 3
        System.out.println("Результат вычисления задания 3 - " + calculateNumber3(1, 2, 3, 4));
        //Задание 4
        System.out.println("Результат вычисления задания 4 - " + checkTrue4(3, 9));
        //Задание 5
        checkNumberStatus5(5);
        //Задание 6
        System.out.println("Результат вычисления задания 6 - " + checkNumberStatusbBool(6));
        ;
        //Задание 7
        HelloName7("Себастьян Перейра");
        //Задание 8
        checkVisokos8(400);


    }

    static void initVariable2() {
        byte one = 1;
        short two = 10;
        int three = 100;
        long four = 1000l;
        float five = 10000.01f;
        double six = 100000.001d;
        char seven = 'A';

        System.out.println(one + " - byte \n" + two + " - short \n" + three + " - int \n" + four + " - long \n" + five + " - float \n" + six + " - double \n" + seven + " - char \n");

    }

    static double calculateNumber3(int a, int b, int c, int d) {

        return (a * (b + (c / d)));
        //double result = a * (b + (c / d));
        //return result;
    }

    static boolean checkTrue4(int number1, int number2) {

        //if ((number1 + number2) >= 10 && (number1 + number2) <= 20) return true;
        //else return false;
        return ((number1 + number2) >= 10 && (number1 + number2) <= 20);
    }

    static void checkNumberStatus5(int checkNumber) {
        if (checkNumber < 0) {
            System.out.println("Результат вычисления задания 5 - Число отрицательное");
        } else {
            System.out.println("Результат вычисления задания 5 - Число положительное");
        }
    }

    static boolean checkNumberStatusbBool(int num1) {
        //if (num1 < 0) return true;
        //return false;
        return (num1 < 0);
    }

    static void HelloName7(String Name) {
        System.out.println("Привет, " + Name);
    }

    static void checkVisokos8(int yearForCheck) {
        //int YearCount;
        /*
        if (yearForCheck % 400 == 0) {
            System.out.println("Високосный 400");
        } else if (yearForCheck % 100 == 0) {
            System.out.println("НеВисокосный 100");
        } else if (yearForCheck % 4 == 0) {
            System.out.println("Високосный 4");
        } else {
            System.out.println("НеВисокосный");
        }

         */
        //if (yearForCheck % 400 == 0  || yearForCheck % 4 == 0) {
        //System.out.println("Високосный");
        if (yearForCheck %4 == 0 && yearForCheck %100 !=0 || yearForCheck % 400 == 0) {

            System.out.println("Високосный");

        } else {
            System.out.println("Невисокосный");

        }

    }
}


