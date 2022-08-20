class Main {
    public static void main(String[] args) {
        // 1. Structure
        // 2. Application

        // Iteration
        // Enhanced vs Indexed

        int[] ar = {9,2,8,4,3};

        // Enhanced
        // for(dataType name : dataStructureName) {

        // }

        for(int val : ar) {
            System.out.println(val);
        }

        // Pros
        // - easier to write <------ only this for now
        // - later on this will be used to access
        //   data in more complex data structures

        // Cons
        // - You have no access to the index
        //   - you can't change values
        //   - you don't know where you are in the array
        //   - cannot skip values
        //   - cannot check neighbors

        // It's used only when you need to check
        // each individual value once.

        // ex. countEvens
        // ex. bigDiff
        // ex. centeredAverage
        // ex. sum28

        // 1. Count the even numbers - YES

        // int cnt = 0;
        // for(int val : ar) {
        //   if(val % 2 == 0) {
        //     cnt++;
        //   }
        // }
        // System.out.println(cnt);

        // 2. Change every instance of 5 to 15 - NO
        //      ^

        // 3. See if there is a 2 next to a 2 - YES/(NO)
        // boolean seen2 = false;
        // for(int val : ar) {
        //   if(seen2 == true && val == 2) {
        //     // YES
        //   } else if(seen2 == true) {
        //     seen2 = false;
        //   } else if(val == 2) {
        //     seen2 = true;
        //   }
        // }

        // for(int i = 0; i < ar.length; i++) {
        //   if(ar[i] == 2 && ar[i+1] == 2) {
        //     YES
        //   }
        // }

        // Indexed For Loops

        // Con
        // - it takes longer to write
        // - later on, this loop cannot access
        //   the values in certain data structures

        // Pros
        // - does everything the enhanced loop does
        //   without the cons


        // Neighboring Indices
        // - this requires the indexed for loop

        // if I am checking forward some N indices
        // ex. ar[i] and ar[i+N]
        // then I have to reduce the length by N

        // for(int i = 0; i < ar.length - N; i++)

        // [1,2,3,4,5]
        //     [i   i+2]

        // if I am checking backward some N indices
        // ex. ar[i] and ar[i-N]
        // then I increase the start by N

        // for(int i = 0 + N; i < ar.length; i++)

        //     [1,2,3,4,5]
        //     [i-2 i]

        // Short Circuiting
        // Abusing && and ||

        // Languages try to be efficient
        // _____ && ______
        //   ^         ^
        //  false   skipped

        // _____ || ______
        //   ^         ^
        //  true     skipped

        // for(int i = 0; i < ar.length; i++)

        // if(i < ar.length - i && ar[i] == ar[i+1])

        // if(i >= ar.length - 1 || ar[i] == ar[i+1])

        // When to use short circuiting
        // - if it requires to check every value with i
        // - you have situations where you check
        //   different sets of neighboring indices
        //   - if(ar[i] == ar[i+1])
        //   - if(ar[i] == ar[i+2])

        // 9 2 8 4 3
        //       [  ]
        //     [    ]

        // ex. has77
        // ex. twoTwo


        // When you don't have to
        // - if it does NOT require you to check every
        //   value with i

        // ex. has22
        // ex. matchUp
        // ex. modThree
        // ex. haveThree

        // Cloning / Patterns

        // 1. figure out the length of the clone
        // 2. figure out if you need to establish
        //    a pattern or use a variable to track
        //    the position in the clone

        // figuring out the length
        // 1. counting something
        //    ex. evenOdd or warmup questions
        // 2. finding the rest before/after
        //    a certain position
        //    ex. pre4, post4

        // pattern
        // ex. shiftLeft
        // [1,2,3,4,5] -> [2,3,4,5,1]
        //  i -> i+1
        //  0 -> 1
        //  1 -> 2
        //  2 -> 3
        //  3 -> 4
        //  4 -> 0 X

        // int[] nums = {1,2,3,4,5};

        // int[] clone = new int[nums.length];

        // for(int i = 0; i < ar.length - 1; i++) {
        //   clone[i] = ar[i+1];
        // }
        // clone[clone.length - 1] = ar[0];

        // for(int i = 0; i < ar.length; i++) {
        //   clone[i] = ar[(i+1) % ar.length];
        // }

        // [9,2,8,4,3]
        //          i i+1
        // i -> (i+1) % len

        // further with patterns (outside of cloning)
        // - patterns generally utilize the index (i),
        //   the length (___.length) and any other
        //   relevant variables pertinent to the question

        // ex. sameEnds

        // Strategies for iterative questions

        // WRITE ON PAPER THE ARRAY

    }
}
