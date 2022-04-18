package valdes.com.company;

import java.util.Arrays;

import static valdes.com.company.BubbleSort.*;


public class Main {

    public static void main(String[] args) {

        BubbleSort<String> bubbleSort = new BubbleSort<>();
        System.out.println("Введите длину массива --->>> ");
        int length = readNumber();
        int[] orderValues = new int[length];

        System.out.println("Введите элементы массива --->>> ");
        String[] data = new String[length];
        bubbleSort.fillArrayItems(data);

        System.out.println("Введите порядок массива --->>> ");
        bubbleSort.fillArray(orderValues);
        bubbleSort.sort(data, orderValues);

        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(orderValues));

    }


}
