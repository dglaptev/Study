package sort;

public class Sort {

    public static int swapCount = 0;

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if (array[j] > array[j+1]) swap(array, j, j+1);
            }
        }
        return array;
    }

    public static int[] combSort(int[] array) {

        int startInd = 0; int endInd = array.length - 1;
        boolean isSwap = true;

        for (int i = startInd; i < endInd; i++) {
            if (isSwap) {
                isSwap = false;
                for (int j = startInd; j < endInd; j++) {
                    if (array[j] > array[j+1]) {
                        swap(array, j, j+1);
                        isSwap = true;
                    }
                }
                for (int j = endInd; j > startInd ; j--) {
                    if (array[j - 1] > array[j]) {
                        swap(array, j-1, j);
                        isSwap = true;
                    }
                }
                startInd++;
                endInd--;
            }
        }
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, index, end);
        return index;
    }

    public static int[] qSort(int[] array, int begin, int end) {
        if (begin < end){
            int index = partition(array, begin, end);
            qSort(array, begin, index - 1);
            qSort(array, index + 1, end);
        }
        return array;
    }

    public static int[] quickSort(int[] array) {
        int[] arr = qSort(array, 0, array.length - 1);

        return arr;
    }



    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; ) {
            int curr = array[i];
            int prevIndex = i - 1;
            while ((prevIndex >= 0) && (array[prevIndex] > curr)) {
                swap(array, prevIndex + 1, prevIndex);
                prevIndex--;
            }
            i++;
        }
        return array;
    }




    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        swapCount++;
    }

}
