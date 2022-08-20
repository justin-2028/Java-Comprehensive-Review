import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] ar = {9,2,8,4,3};

        // Arrays.toString(arrayName)
        // to get a String version of the array
        System.out.println(Arrays.toString(ar));

        // Making a copy or a variant
        // of an existing array without
        // changing the existing values of the
        // original

        // 1. figuring out the length of the
        //    cloned array
        // 2. figuring out how the indices
        //    line up

        // 9 2 8 3 4
        // 0 1 2 3 4

        // 2 8 4
        // 0 1 2

        // Generate a clone that is the original
        // with its values doubled
        // 9 2 8 4 3 => 18 4 16 8 6
        // 0 1 2 3 4     0 1  2 3 4

        // the clones length may be based off
        // of the length of the original
        int[] clone = new int[ar.length];
        for(int i = 0; i < ar.length; i++) {
            clone[i] = ar[i] * 2;
        }
        System.out.println(Arrays.toString(clone));

        // I want to generate a new array consisting
        // of only the even numbers

        // 1. figure out how many even numbers there are

        // given ar, count the number of even values
        // in the array

        int cnt = 0;
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

        int[] evens = new int[cnt];

        // 9 2 8 3 4
        // 0 1 2 3 4

        // _ _ _
        // 0 1 2

        // create a variable to track the index
        // that you are on in the clone

        int index = 0;
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] % 2 == 0) {
                evens[index] = ar[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(evens));


        int[] nums = {1,2,3,4,1,2,3,1,2,1};

        // Given nums, generate a new array
        // consisting of the values that
        // are odd.

        cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                cnt++;
            }
        }

        int[] odds = new int[cnt];

        index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 != 0) {
                odds[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(odds));

        // Reverse the order of the numbers
        // [9,2,8,4,3] -> [3,4,8,2,9]
        //  0 1 2 3 4      0 1 2 3 4

        // i    length - 1 - i
        // 0 -> 4
        // 1 -> 3
        // 2 -> 2
        // 3 -> 1
        // 4 -> 0

        int[] reversed = new int[ar.length];

        for(int i = 0; i < ar.length; i++) {
            reversed[reversed.length - 1 - i] = ar[i];
        }

        System.out.println(Arrays.toString(reversed));

        // When it comes to patterns... it's usually
        // some form of utilizing the length and the index

        // other relevant variables can also be considered

        // shift all the values left once
        // [9,2,8,4,3] -> [2,8,4,3,9]
        //  0 1 2 3 4      0 1 2 3 4

        // 0 -> 4
        // i    i-1
        // 1 -> 0
        // 2 -> 1
        // 3 -> 2
        // 4 -> 3

        // do the pattern first, then the outlier separately

        int[] left = new int[ar.length];

        for(int i = 1; i < ar.length; i++) {
            left[i-1] = ar[i];
        }

        left[left.length - 1] = ar[0];

        System.out.println(Arrays.toString(left));

        // generating an array off of not an array

        // range a-b

        // int a = 1;
        // int b = 10;

        // generate an array consisting of all the
        // values between a (inclusive) and b (exclusive)

        // 1,10 => [1,2,3,4,5,6,7,8,9]
        //          0 1 2 3 4 5 6 7 8
        index = 0;
        int[] arr = new int[b - a];
        for(int i = a; i < b; i++ ) {
            arr[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
