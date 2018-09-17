public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        for (int i =0; i <arr.length-1; i++)
        {
            swap(i, findmin(i, arr), arr);
        }
    }

    public void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int findmin(int from, int[] arr) {
        int min = from;
        {
            for (int k = from + 1; k <arr.length; k++)
            {
                if (arr[k] < arr[min])
                    min = k;
            }
            return min;
        }
    }
}
