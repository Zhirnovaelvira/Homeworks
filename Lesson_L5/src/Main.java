import java.util.Random;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(compareTwoNumbers(10,3));
        printNumber(-3);
        System.out.println(isNegativeNumber(-1));
        printString(5, "hello world");
        System.out.println(isLeapYear(2100));
        fillArray();
        fillArrayByHundred();
        sixToTwo();
        createMatrix(10);
        printArray(createFilledArray(10, 220));
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign() {
        int a = generateNumber(15);
        int b = generateNumber(10);
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }
    }

    private static void printColor() {
        int value = generateNumber(1000);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = generateNumber(10);
        int b = generateNumber(20);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // Задание 5
    private static boolean compareTwoNumbers(int a, int b) {
        var sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // Задание 6
    private static void printNumber(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    // Задание 7
    private static boolean isNegativeNumber(int a) {
        return !( a >= 0);
    }

    // Задание 8
    private static void printString(int a, String value) {
        for (int i = 0; i < a; i++) {
            System.out.println(value);
        }
    }

    // Задание 9
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    // Задание 10
    private static void fillArray() {
        int[] num = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < num.length; i++) {
            if ( num[i] == 1 )  {
                num[i] = 0;
            } else {
                num[i] = 1;
            }
        }
        printArray(num);
    }

    // Задание 11
    private static void fillArrayByHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++)  array[i] = i + 1;;
        printArray(array);
    }

    // Задание 12
    private static void sixToTwo() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        printArray(array);
    }

    // Задание 13
    private static void createMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;  // Главная диагональ
            matrix[i][size - 1 - i] = 1;  // Побочная диагональ
        }

        for (int[] row : matrix) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }

    // Задание 14
    public static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    private static int generateNumber(int maxNumber) {
        Random random = new Random();
        int isPositive = random.nextBoolean() ? 1 : -1;
        return random.nextInt(maxNumber) * isPositive;
    }

    // Вспомогательный метод для вывода массива
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}