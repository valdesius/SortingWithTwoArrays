package valdes.com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class BubbleSort<T> {
    private final Scanner scanner = new Scanner(System.in);
    private int lengthArr;
    int[] orderValues;


    public BubbleSort() {
    }

    public BubbleSort(int length, int[] orderV, String[] data) {
        this.lengthArr = length;
        this.orderValues = orderV;

    }

    public int readNumber() {
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

    public String[] fillArrayItems(String[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.printf("Введите %d элемент массива: ", i + 1);
                arr[i] = scanner.next();
            } catch (InputMismatchException e) {
                System.err.println("Error. Incorrect data entered. You entered string or not correct symbols");
            }
        }
        return arr;
    }

    public static <T> void sort(T[] data, int[] orderValues) {
        int size = orderValues.length;
        for (int i = 1; i < size - 1; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (orderValues[j - 1] > orderValues[j]) {

                    //сортировка интовых значений

                    int temp = orderValues[j - 1];
                    orderValues[j - 1] = orderValues[j];
                    orderValues[j] = temp;

                    //сортировка T элементов

                    T tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}