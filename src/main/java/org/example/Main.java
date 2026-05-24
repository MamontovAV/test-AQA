package org.example;
// Задание 1
/*public class Main {
    public static void main(String[] args) {
        printThreeWords();
    }
public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}*/
// Задание 2
/*public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }
public static void checkSumSign() {
        int a = 0;
        int b = 1;
      int sum = a + b;
         if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}*/

// Задание 3
/*public class Main {
    public static void main(String[] args) {
        printColor();
    }
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else { // value > 100
            System.out.println("Зеленый");
        }
    }
}*/

// Задание 4
/*public class Main {
    public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 3;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}*/

//Задание 5
/*public class Main {
    public static void main(String[] args) {
        System.out.println(sum10and20(5, 5));
    }

    public static boolean sum10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
}*/

//Задание 6
/*public class Main {
    public static void main(String[] args) {
        check(-5);
    }
    public static void check(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}*/

//Задание 7
/*public class Main {
    public static void main(String[] args) {
        System.out.println(checkNumber(-5));
        System.out.println(checkNumber(10));
        System.out.println(checkNumber(0));
    }
    public static boolean checkNumber(int number) {
        return number >= 0;
    }
}*/

//Задание 8
/*public class Main {
    public static void main(String[] args) {
        slovoCifra("Hi", 5);
    }
    public static void slovoCifra(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}*/

//Задание 9
//---------------

//Задание 10
/*import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Исходный массив
        int[] array = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1};

        System.out.println("Исходный массив: " + Arrays.toString(array));

        invertArray(array);
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
    }
    }*/

//Задание 11
/*import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[100];
        fillArray(array);
        System.out.println("\nВесь массив:");
        System.out.println(Arrays.toString(array));
    }
    public static void fillArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            array[i] = i + 1;
            i++;
        }
    }
        }*/

//Задание 12
/*import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        multiplyLessThanSix(array);
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }

    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
    }
}*/

//Задание 13
/*import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем квадратный массив 5x5
        int size = 5;
        int[][] matrix = new int[size][size];

        System.out.println("Исходный массив (все нули):");
        printMatrix(matrix);

        // Заполняем главную диагональ единицами
        fillMainDiagonal(matrix);

        System.out.println("\nМассив после заполнения главной диагонали:");
        printMatrix(matrix);
    }

    // Заполнение главной диагонали (слева направо, сверху вниз)
    public static void fillMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
    }

    // Метод для вывода двумерного массива
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

//Задание 14
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = createArray(5, 10);
        System.out.println("Массив длиной 5, заполненный 10: " + Arrays.toString(array1));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

