import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static int[] push(int[] arr, int item) {
        int[] tmp = Arrays.copyOf(arr, arr.length + 1);
        tmp[tmp.length - 1] = item;
        return tmp;
    }

    public static int[] pop(int[] arr) {
        int[] tmp = Arrays.copyOf(arr, arr.length - 1);
        return tmp;
    }

    public static void bubbleSort(int[] data) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    // Swap elements
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Add Length Numbers : ");
        Scanner lenghtData = new Scanner(System.in);
        Integer length = lenghtData.nextInt();
        System.out.println("Length Data : " + length);
        int[] data = {};
        for (int i = 0; i < length; i++) {
            System.out.println("Add New Number : ");
            Scanner newIntScan = new Scanner(System.in);
            Integer newInt = newIntScan.nextInt();
            data = push(data, newInt);
        }
        bubbleSort(data);
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}