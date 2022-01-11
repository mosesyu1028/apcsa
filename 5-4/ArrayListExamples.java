public class ArrayListExamples {

    // Why ArrayList over array
    // 1. capbility to change in size
    // 2. last slot is always list.size()-1 (in a array, we need another variable for a partially filled array)
    // 3. simple, efficient insertion and deletion
    // 4. easier printing: System.out.print(list); (arr will print out the address instead of the content)

    public static void main(String args[]) {

        int[] arr;
        ArrayList<Integer> integerList = new ArrayList<Integer>(); // initialization

        // strlen = str.length();
        arrlen = arr.length;
        arrListlen = integerList.size();

        arrNum3 = arr[3];
        ArrListNum3 = integerList.get(3);

        arr[4] = 10;
        integerList.set(4, 10); // set(index, element)
        Integer oldElem = integerList.set(4, 8); // oldElem = 10

        // append to last slot of ArrayList
        integerList.set(integerList.size(), 5); // doesn't work, out of bounds (see below)
        integerList.add(integerList.size(), 5); // (index, value)
        integerList.add(5); // (value)


        integerList.remove(3);
        integerList.add(3, 6); // (index, value)

        // throws IndexOutOfBoundsException if out of range
        // get, remove, set: index >= 0 && index < size()
        // add: index >= 0 && index <= size()

        // Ex. 1
        // ArrayList<Integer> is our "class"
        ArrayList<Integer> perfectSq = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            perfectSq.add(i*i); // autoboxes
        }
        // perfectSq is 0 1 4 9 16

        Integer intOb = perfectSq.get(2); // intOb = 4
        int n = perfectSq.get(3); // n = 9

        Integer x = perfectSq.set(3, 5); // x = 9, perfectSq is 0 1 4 5 16
        x = perfectSq.remove(2); // x = 4, perfectSq is 0 1 5 16

        //           idx val
        perfectSq.add(1, 7); //perfectSq is 0 7 1 5 16
        perfectSq.add(2, 8); //perfectSq is 0 7 8 1 5 16



        // ConcurrentModificationException
        // this error may be thrown whenever you try to add or delete an element inside an enhance for loop

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // code to initialize list with values

        for (Integer num : list2) {
            if (num < 0) {
                list2.add(0); // WRONG: ConcurrentModificationException
            }
        }
        // fix: DO NOT use enhanced for loops to add or delete elements
        // you are still allowed to use enhanced for loops to modify objects inside ArrayList (set() is fine)
    }
    
    // swap two values, indexed at i and j
    public static void swap(ArrayList<E> list, int i, int j) {
        E temp = list.get(i);
        list.set(i, list.get(j)); // (idx, val)
        list.set(j, temp);
    }

    // list is 0 5 -6 -2 7 -1
    public static void printNegs(ArrayList<Integer> list) {
        System.out.println("The negative values in the list are: ");
        for (Integer i : list) { // enhanced for loop
            if (i < 0) { // auto-unboxing
               System.out.print(i); //The negative values in the list are: -6 -2 -1
            }
        }
    }

    /* Remove all occurrences of value from list. */
    public static void removeAll(ArrayList<Integer> list, int value)
    {
        int index = 0;
        while (index < list.size())
        {
            if (list.get(index) == value) {
                list.remove(index); // no need index++ because the ArrayList moves one to the left
            }
            else {
                index++;
            }
        }
    }

    // turns an ArrayList<Integer> to an int[]
    public static int[] toArr(ArrayList<Integer> list) {
        int[] returnArr = new int[list.size()]; // initialize

        for (int i = 0; i < list.size(); i++) {
            returnArr[i] = list.get(i); // auto-unboxing
        }
        return returnArr;
    }

    // turns an int[] to an ArrayList<Integer>
    public static ArrayList<Integer> toArrList(int[] arr) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            returnList.set(i, );
        }
        return returnList;
    }

}
