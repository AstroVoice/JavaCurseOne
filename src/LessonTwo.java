import java.util.Arrays;

public class LessonTwo {

    public static void main(String[] args) {
        //1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] task1arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(task1arr);
        System.out.println("Результат реверса - " + Arrays.toString(task1arr));

        //2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] task2arr = new int[8];
        task2(task2arr);
        System.out.println("Результат прогрессии - " + Arrays.toString(task2arr));

        //3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] task3arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(task3arr);
        System.out.println("Умножение по результату проверки - " + Arrays.toString(task3arr));

        // 4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        int[] task4arr = {1, 2, 3, 4, 5};
        System.out.println("MAX - " + task4Max(task4arr) + " MIN - " + task4Min(task4arr));

        //5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные элементы единицами, используя цикл(ы);
        int cubeSide = 5;
        int[][] task5arr = new int[cubeSide][cubeSide];
        task5PaintCross(task5arr);
        printCube(task5arr);

        //6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
        // Абстрактная граница показана символами ||, эти символы в массив не входят.
        int [] task6arr = {1,1,1,2,1};
        System.out.println("Balance - " + task6Balance(task6arr));

        //7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций.
        int [] task7arr = {1,2,3,4,5};
        System.out.println("До смещения - " + Arrays.toString(task7arr) );
        task7pusher(task7arr, 2);
        System.out.println("После смещения - " + Arrays.toString(task7arr) );

    }


    private static void task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
    }

    private static void task2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }
    }

    private static void task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //arr[i] = (arr[i] < 6) ? arr[i]*2 : arr[i];
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    private static int task4Max(int[] arr) {
        int max = arr[0];
        for (int index : arr) {
            if (index > max)
                max = index;
        }
        return max;
    }

    private static int task4Min(int[] arr) {
        int min = arr[0];
        for (int index : arr) {
            if (index < min)
                min = index;
        }
        return min;
    }

    private static void printCube(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void task5PaintCross(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 - i] = 1;
        }
    }

    public static boolean task6Balance(int [] arr){
        int right = 0;
        int left = 0;
        for(int i = 0; i < arr.length -1; i++){
            left +=arr[i];
            for(int j = i+1; j<arr.length; j++)
                right += arr[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }
    private static void task7pusher(int[] arr, int value){
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= arr.length -1;
        int lastIndex = arr.length -1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? arr[0] : arr[lastIndex];
            for (int j =0; j < lastIndex; j++) {
                if (direction)
                    arr[j] = arr[j + 1];
                else
                    arr[lastIndex - j] = arr[lastIndex - j -1];
            }
            if (direction)
                arr[lastIndex] = temp;
            else
                arr[0] = temp;

        }
    }
}




