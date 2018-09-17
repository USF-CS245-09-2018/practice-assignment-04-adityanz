public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort (int [] arr)
    {
        boolean swaps = true;
        int k = 0;
        while (swaps){
            swaps = false;
            for (int j = 0; j < arr.length-1-k; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j, j + 1, arr);
                    swaps = true;
                }
            }
            k++;
        }
    }

    public void swap (int a, int b ,int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
