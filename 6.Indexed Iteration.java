class Main {
    public static void main(String[] args) {
        // Loops
        // These building blocks are used to
        // repeat things

        // Repeating if statement
        // - it will continue to repeat
        //   while the condition is true

        // 3 Components
        // Start
        // End
        // Change

        // The change is responsible for
        // getting your starting state to
        // the ending state

        // a is my state
        // int a = 0; // start

        // I want to keep looping until
        // a reaches 5

        // while(a < 5) { // end
        //   System.out.println(a);
        //   a++; // change
        // }

        // System.out.println(a);

        // Treat for loops logically
        // the same way as a while loop

        // for(start; end; change) {}

        // for(int i = 0; i < 5; i++) {
        //   System.out.println(i);
        // }

        // For loops variable/state
        // will generally not be accessible
        // outside of the loop

        // for(int i = 0; i < 5; i++) {
        //   System.out.println(i);
        // }

        // 1 <-- start
        // 2
        // 3
        // 4
        // 5 <-- end

        // for(int i = 1; i < 6; i++) {
        //   System.out.println(i);
        // }

        // 10 <-- start
        // 9
        // 8
        // 7
        // 6 <-- end

        // for(int i = 10; i > 5; i--) {
        //   System.out.println(i);
        // }

        // 3 <-- start
        // 6
        // 9
        // 12
        // 15 <-- end

        // for(int i = 3; i < 16; i += 3) {
        //   System.out.println(i);
        // }

        // 1)

        // 2
        // 4
        // 6
        // 8
        // 10

        // for(int i = 2; i < 11; i += 2) {
        //   System.out.println(i);
        // }

        // 2)

        // 10
        // 20
        // 30
        // 40
        // 50

        // for(int i = 10; i < 51; i += 10) {
        //   System.out.println(i);
        // }

        // 3)

        // 1
        // 2
        // 4
        // 8
        // 16

        // for(int i = 1; i < 17; i += i) {
        //   System.out.println(i);
        // }

        // Conditions with loops

        // 1
        // EVEN
        // 3
        // EVEN
        // 5

        // for(int i = 1; i < 6; i++) {
        //   if(i % 2 == 0) {
        //     System.out.println("EVEN");
        //   } else {
        //     System.out.println(i);
        //   }
        // }

        // 1
        // 2
        // THREE
        // 4
        // 5
        // THREE
        // 7
        // 8
        // THREE
        // 10
        // for(int i = 1; i < 11; i++) {
        //   if(i % 3 == 0) {
        //     System.out.println("THREE");
        //   } else {
        //     System.out.println(i);
        //   }
        // }

        // 1
        // 2
        // THREE
        // 4
        // FIVE
        // THREE
        // 7
        // 8
        // THREE
        // FIVE
        // 11
        // THREE
        // 13
        // 14
        // THREEFIVE

        // for(int i = 1; i < 16; i++) {
        //   if(i % 3 == 0 && i % 5 == 0) {
        //     System.out.println("THREEFIVE");
        //   } else if(i % 3 == 0) {
        //     System.out.println("THREE");
        //   } else if(i % 5 == 0) {
        //     System.out.println("FIVE");
        //   } else {
        //     System.out.println(i);
        //   }
        // }


        // Indexed Iteration

        int[] ar = {9,2,8,4,3};
        //          0 1 2 3 4

        // i in the for loop stands for index

        // our loop will use its state to
        // access each INDEX of the array

        // for(int i = 0; i < 5; i++) {
        //   System.out.println(i);
        //   System.out.println(ar[i]);
        //   System.out.println();
        // }

        // for(int val : ar) {
        //   System.out.println(val);
        // }

        // i    ar[i]
        // 0 -> ar[0]
        // 1 -> ar[1]
        // 2 -> ar[2]
        // 3 -> ar[3]
        // 4 -> ar[4]

        int[] nums = {3,4,7};
        //            0 1 2
        // for(int i = 0; i < 3; i++) {
        //   System.out.println(nums[i]);
        // }

        // We can use the length of the array
        // to figure out the ending state
        // of our loops

        // for(int i = 0; i < nums.length; i++) {
        //   System.out.println(nums[i]);
        // }

        // for(int i = 0; i < nums.length; i++) {
        //   nums[i] = nums[i] * 2;
        // }

        // for(int val : nums) {
        //   System.out.println(val);
        // }

        // 1. Counting
        // 2. Sum
        // 3. Max/Min

        // 1) Count the number of values
        //    in ar that are greater than 4
        //    and then print the count
        // 2) Find the sum of all the values
        //    and then print the sum
        // 3) Find the max and min of ar
        //    and print them

        // name[i] -> value
        // i -> index

        int cnt = 0;
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] > 4) {
                cnt++;
            }
        }
        System.out.println(cnt);

        int sum = 0;
        for(int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        System.out.println(sum);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] > max) {
                max = ar[i];
            }
            if(ar[i] < min) {
                min = ar[i];
            }
        }

        System.out.println(max);
        System.out.println(min);
    }
}