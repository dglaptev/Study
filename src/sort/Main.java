package sort;

public class Main {


    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {6, 9, 1, 4, 3, 8, 2, 10, 7, 5, 1, 1};
        print(array);

//        array = Sort.insertionSort(array);
//        array = Sort.bubbleSort(array);
//        array = Sort.combSort(array);
        array = Sort.quickSort(array);

        System.out.println("swaps " + Sort.swapCount);

        print(array);
    }


}
