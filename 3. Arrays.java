import java.util.*; // this gives us access to the Arrays library

public class Main {
    public static void main(String[] args) {
        // 1. Variables
        // 2. If Statements
        // 3. Loops
        // 4. Data Structures

        // Data structures are basically big containers that store data at addresses

        // ARRAYS

        // An array stores values at indices (index)
        // - The values are ordered
        // - The size is static (you cannot add/remove values)
        // - The data type is static

        // Declaring an array

        // dataType[] name = new dataType[size]

        int[] nums = new int[5];

        // default values
        // when arrays are declared this way... Java will provide default values for each of the values
        // int - 0
        // double - 0.0
        // boolean - false
        // String - null

        System.out.println(nums); // [I@76ed5528
        System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0, 0]

        // [0, 0, 0, 0, 0] values
        //  0  1  2  3  4  indices

        // Indices will always start at 0 from the leftmost value
        // and increase by 1 until it reaches the rightmost value

        // Accessing values
        // name[index] - this will give us access to the value at that index

        System.out.println(nums[0]);

        // Changing values
        // we can use the same way we access values to change the values
        nums[0] = 5;

        System.out.println(Arrays.toString(nums));

        // Exercise
        // Change the remaining 0s to values between 1-9

        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 7;
        nums[4] = 6;

        System.out.println(Arrays.toString(nums));

        int[] ar = { 9,2,8,4,3 };

        System.out.println(Arrays.toString(ar));

        nums = new int[] { 7,2,8,5,9 };

        // length - there will be some variant of length for every data structure
        // this tells you the # of values in an array

        System.out.println(nums.length);

        // Most of the time we only care about two values as a programmer
        // The first and last values

        // How do we always get the first value?

        // What is the first index? 0 is always the first index
        // The first value is always name[0]

        // How do we always get the last value?

        // [7,2,8,5,9] length: 5
        //  0 1 2 3 4

        // [7,7,7] length: 3
        //  0 1 2

        // [1] length: 1
        //  0

        // The last index is always the length - 1
        // The last value is always name[name.length - 1]

        // There is one scenario where these are not always the case
        // That is when the array is empty

        // When an array empty... the length is 0

        // When you access an index that does not exist... you get an error
        // ArrayIndexOutOfBoundsException

        // System.out.println(nums[100]); 100 is not a valid index

        // The only valid indices are indices that are greater than equal to 0 and less than the length

        // Its easy to check what the length

        if(nums.length > 0) {
            System.out.println(nums[0]);
            System.out.println(nums[nums.length - 1]);
        }

        // Swapping values

        int a = 5;
        int b = 10;

        a = b; // a is assigned 10
        b = a; // b is assigned a which is 10

        // overall: we've lost 5

        a = 5;
        b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        // Middle values

        // [9,2,8,4,3] length: 5
        //  0 1 2 3 4

        // [7,7,7] length: 3
        //  0 1 2

        // [1] length: 1
        //  0

        // This only applies to arrays of ODD length
        // length / 2 gives the middle index

        // [1,2,3,4,5,6] length: 6
        //  0 1 2 3 4 5

        // FOR EVEN length
        // length / 2 gives the rightmost middle index
        // length / 2 - 1 gives the leftmost middle index

    }
}
