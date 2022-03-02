// APCSA 2017 Q1

public class Digits {
    private ArrayList<Integer> digitList;

    // (a)
    public Digits(int num)
    {
        // firstDigit = num % 10 // 123508976 % 10 = 6
        // num /= 10 // 12350897 (int division floors value)
        // 6 7 8 0 5 3 2 1

        digitList = new ArrayList<Integer>();

        // Check for special case
        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            digitList.add(0, num % 10); // or new Integer(num % 10) (not necessary because of autoboxing)
            num /= 10;
        }
    }

    // (b)
    public boolean isStrictlyIncreasing() {
        // num with digits abcde
        // a < b < c < d < e

        for (int i = 0; i < digitList.size() - 1; i++) {
            if (digitList.get(i) >= digitList.get(i + 1)) { // Optionally, use .intValue() (unboxing)
                return false;
            }
        }
        // Alternative:
        // for (int i = 1; i < digitList.size(); i++) {
        //     if (digitList.get(i - 1) >= digitList.get(i)) {
        //         return false;
        //     }
        // }

        return true;
    }

}
