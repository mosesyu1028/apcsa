public class ArrayAlgs {

    /** Returns the number of negative values in arr.
     *  Precondition: arr[0],...,arr[arr.length-1] contain integers.
     */
    public static int countNegs(int[] arr)
    {
        int count = 0;
        for (int num : arr) {

            if (num < 0)
                count++;
        }
        return count;
    }
    // Best case: no negative numbers - don't need to run count++
    // Worst case: all negative numbers



    /** Precondition:
     *   - arr[0],...,arr[n-1] contain integers sorted in increasing order.
     *   - n < arr.length.
     *  Postcondition: num has been inserted in its correct position.
     */
    {
        //find insertion point
        int i = 0;
        while (i < n && num > arr[i])
            i++;
        //if necessary, move elements arr[i]...arr[n-1] up 1 slot
        for (int j = n; j >= i + 1; j--)
            arr[j] = arr[j-1];
        //insert num in i-th slot and update n
        arr[i] = num;
        n++;
    }
    // Best case: num > all elements in array -> inserted at the end, no other elements need to move to make space
    // Worst case: num < all elements  -> all elements have to move to make space

}
