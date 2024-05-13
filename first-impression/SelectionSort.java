public class SelectionSort {

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap elements
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = { 5, 2, 4, 1, 3 };
        selectionSort(data);
        System.out.println("\nSelection Sort: ");
        for (int element : data) {
            System.out.print(element + " ");
        }
    }
}