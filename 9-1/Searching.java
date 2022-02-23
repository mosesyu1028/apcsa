public class Searching

    // Sequential Search
    // Time complexity: O(n)

    // Pseudocode:
    // Start from position 0 and increment every loop
    // Check if key == position value
    // If entire array is looped through, then key not in array


    public int SequentialSearch(int[] arr, int value) {
        for (i = 0; i < arr.length; i++) {
            if (arr[i] = value) {
                return i;
            }
        }
        return -1;
    }


    // Binary Search
    // Only works on sorted arrays
    // Time complexity: O(logn)

    // Pseudocode:
    // Check if middle == value
    // If middle > value, middle is the new end
    // If middle < values, middle is the new start
    // If start > end, key not in array

    public int BinarySearch(int[] arr, int value) {
        int start = 0; // first index
        int end = arr.length - 1; // last index

        while (start <= end) {
            int mid = (start + end) / 2;

            // Guessed correct
            if (arr[mid] == value) {
                return mid;
            }
            // Guessed too low
            else if (arr[mid] < value) {
                start = mid + 1;
            }
            // Guessed too high
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int RecurBinSearchHelper(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;


        RecurBinSearch(arr, value, start, end);
    }


    private int RecurBinSearch(int[] arr, int value, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == value) {
            return mid;
        }
        else if (arr[mid] < value) {
            RecurBinSearch(arr, value, start, mid - 1);
        }
        else {
            RecurBinSearch(arr, value, mid + 1, end);
        }
    }




    public static void main(String[] args) {

    }
}
