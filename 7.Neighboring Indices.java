class Main {
    public static void main(String[] args) {
        // Neighboring Indices

        // checking the immediate neighbors
        // when visiting a value

        // [9,2,8,4,3]
        //  - - ^ - -

        // Count the number of times 2 appears
        // immediately after a 1

        int cnt = 0;
        int[] ar = {9,1,2,2,1,3,1,2,1};
        //                        i i+1

        // ar[i] - value
        // ar[i+1] - value immediately after

        for(int i = 0; i < ar.length - 1; i++) {
            if(ar[i] == 1 && ar[i+1] == 2) {
                cnt++;
            }
        }

        // System.out.println(cnt);

        // Array index out of bounds exception
        // is very common with neighboring indices

        // print out the pairs of numbers

        // for(int i = 0; i < ar.length - 1; i++) {
        //   System.out.println(ar[i]);
        //   System.out.println(ar[i+1]);
        //   System.out.println();
        // }

        // If I go forward some N amount of spaces,
        // I have to reduce my length by the same N amount
        // i, i+N

        // [1,2,3,4,5,6,7,8,9] length: 9
        //  0 1 2 3 4 5 6 7 8
        //              i   i+2

        // for(int i = 0; i < ar.length - 2; i++)

        // If I go backward some M amount of spaces,
        // I have to increase my start by the same M amount
        // i, i-M

        //    [1,2,3,4,5,6,7,8,9] length: 9
        //     0 1 2 3 4 5 6 7 8
        //   i-1 i

        // for(int i = 1; i < ar.length; i++)

        // for(int i = M; i < ar.length - N; i++) {
        //    this range accomodates for i,i+N
        //    and also accomodates for i,i-M
        // }

        // lets print every triplet in the array
        int[] nums = {9,2,8,4,3};
        //                i
        // 9 2 8
        // 2 8 4
        // 8 4 3

        // i-1  i  i+1
        // -1   0   1  X
        //  0   1   2
        //  1   2   3
        //  2   3   4
        //  3   4   5  X

        // for(int i = 1; i < nums.length - 1; i++) {
        //   System.out.println(nums[i-1]);
        //   System.out.println(nums[i]);
        //   System.out.println(nums[i+1]);
        //   System.out.println();
        // }

        for(int i = 0; i < nums.length - 2; i++) {
            System.out.println(nums[i]);
            System.out.println(nums[i+1]);
            System.out.println(nums[i+2]);
        }

        // if you have multiple i+__ or i+__, take the LARGEST

        // Short Circuiting

        // && - if any of them are false, the whole thing is false
        // || - if any of them are true, the whole thing is true

        // if(false && |____) {

        // }

        // if(true || |____) {

        // }

        int[] arr = {9,2,8,4,3};

        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1 && arr[i] == 2 && arr[i+1] == 2) {

            }
        }
    }
}