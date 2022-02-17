public class Sorting {

    // Selection sort O(n^2)
    // Find the smallest element in the array and exchange with a[0]
    // Repeat for a[1], a[2], etc.

    // 8 1 4 6
    // [1] 8 4 6
    // [1 4] 8 6
    // [1 4 6 8]


    // Insertion sort O(n^2)
    // a[0] is a 1-element sorted array
    // Move a[1], a[2], etc. from unsorted to the sorted section

    // [8] 1 4 6
    // [1 8] 4 6
    // [1 4 8] 6
    // [1 4 6 8]

    // Merge sort O(nlogn)
    // 1. Break the array into two halves
    // 2. Mergesort the left and right
    // 3. Merge the two subarrays into sorted

    // 5 -3 2 4 0 6
    // [5 -3 2] [4 0 6]
    // [5 -3] [2] | [4 0] [6]
    // [-3 5] [2] | [0 4] [6]
    // [-3 2 5] [0 4 6]
    // [-3 0 2 4 5 6]


    private int[] a;

    public Sorting(int[] arr) {
        a = arr;
    }

    // Swap a[i] and a[j] in array a
    private void swap(int i, int j) {
        // [i]      [j]     [temp]

        // a[i]     a[j]    a[i]
        // a[j]     a[j]    a[i]
        // a[j]     a[i]    a[i]

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void SelectionSort() {

        // 8 1 4 6    i=0
        // [1] 8 4 6  i=1
        // [1 4] 8 6  i=2
        // [1 4 6 8]  final


        // for i number of passes
        for (int i = 0; i < a.length - 1; i++) {

            // find the smallest element in unsorted list
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }
            swap(i, min_idx);
        }

    }

    public void InsertionSort() {

        // [8] 1 4 6 i=1
        // [1 8] 4 6 i=2

        // [1 x 8] 6 push everything >key in sorted subarray to the right
        // [1 4 8] 6 slot the key in

        // [1 4 8] 6 i=3
        // [1 4 6 8] final

        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i-1; // j is the last index of our sorted subarray

            // Move elements of arr[0...j] that are greater than key to one pos ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void MergeSort(int[] a) {

        // 5 -3 2 4 0 6
        // [5 -3 2] [4 0 6]
        // [5 -3] [2] | [4 0] [6]
        // [-3 5] [2] | [0 4] [6]
        // [-3 2 5] [0 4 6]
        // [-3 0 2 4 5 6]


        int n = a.length
        int mid = n / 2; // if n is odd, midpoint is one to the left

        // create temp arrays for left and right side
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        // put values in to left and right array
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }

        // Magic
        mergeSort(l);
        mergeSort(r);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }


    public static void main(String[] args) {

    }
}
