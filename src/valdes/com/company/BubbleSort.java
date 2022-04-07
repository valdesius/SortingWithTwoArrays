package valdes.com.company;

public class BubbleSort<T> {


    public  int[] sort(int[] data) {
        int size = data.length;
        for (int i = 1; i < size - 1; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (data[j - 1] > data[j]) {
                    int temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data;
    }


    public static <T> void sorting(String[] data, int[] orderValues){
        int tempNum;
        String tempName;

        for (int i = 0; i < orderValues.length; i++)
        {
            for (int j = i + 1; j < orderValues.length; j++)
            {
                if (orderValues[i] > orderValues[j])
                {
                    tempNum = orderValues[i];
                    tempName=data[i];

                    orderValues[i] = orderValues[j];
                    data[i] = data[j];

                    orderValues[j] = tempNum;
                    data[j] = tempName;
                }
            }
            System.out.println(data[i]);
        }
    }
}
