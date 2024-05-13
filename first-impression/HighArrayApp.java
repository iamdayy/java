public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 10;
        HighArray arr;
        arr = new HighArray(maxSize);
        arr.insert(70);
        arr.insert(55);
        arr.insert(20);
        arr.insert(20);
        arr.insert(20);
        arr.insert(20);
        arr.BubbleSort();
        arr.display();
        arr.delete(20);
        arr.BubbleSort();
        arr.display();
    }
}
