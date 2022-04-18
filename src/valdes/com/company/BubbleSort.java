package valdes.com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort<T> {
    public BubbleSort() {
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        try {
            length = scanner.nextInt();
            if (length < 1) {
                System.err.print("Error. Length of array can't be greater than 1...");
            }
            return length;
        } catch (InputMismatchException e) {
            System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            return 0;
        }
    }

    public int[] fillArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.printf("Введите %d элемент массива: ", i + 1);
                arr[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            }
        }
        return arr;
    }

    public T fillArrayItems(T[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.printf("Введите %d элемент массива: ", i + 1);
                arr[i] = (T) scanner.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            }
        }
        return (T) arr;
    }


    public void sort(T[] data, int[] orderValues) {
        int size = orderValues.length;
        for (int i = 1; i < size - 1; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (orderValues[j - 1] > orderValues[j]) {
                    //сортировка интовых значений

                    int temp = orderValues[j - 1];
                    orderValues[j - 1] = orderValues[j];
                    orderValues[j] = temp;

                    //сортировка generic

                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}