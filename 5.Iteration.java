public class Main  {
    public static void main(String[] args) {
        // Iteration

        // Enhanced For Loop
        // this is a tool that lets us access each value of a data structure
        // by assigning each value of the data structure to a variable exactly once

        // [7,2,1,9,3]

        // val: 3

        // do something with val

        // structuring an enhanced for loop

        // for(_____________ : __________________________)
        //     dataType name   name of the data structure

        int[] ar = {7,2,1,9,3};

        for(int v : ar) {
            System.out.println(v);
        }

        // What is iteration?

        // The act of accessing each piece of data in a data structure
        // and deriving some results from the data

        // iteration leads to algorithms

        // finding the sum of all the numbers

        // What are our limitations?

        // Enhanced for loop
        // - each value can only be accessed once
        // - you cannot change any of the values
        // - we do not have access to the index
        // - we have a hard time determining where exactly we are in the array

        // Imagine this context
        // - 5 unmarked doors
        // - behind each door is some random number
        // - you can have any # of sheets of paper, but you can only write
        //   one piece of information on any sheet of paper
        // - you can update the information on the paper at anytime

        // Logic Limitations
        // - You have really bad memory
        //    - as soon as I close a door, I've already forgotten what the number was
        // - You can only open each door once
        // - You can only have one door open at a time

        // Without using coding terms, I want you guys to write out how you
        // would find the sum of all the numbers behind the doors

        // 1. They use one sheet of paper and update the number on the paper
        //    by adding the number behind the door to the number on the paper
        // 2. They use the same number of sheets of paper to mark down each
        //    individual number on a separate sheet of paper

        // We use a single sheet of paper, we can have a 0 on the paper initially
        // Then as we open each door, one by one, we add to the number on our paper
        // whatever is behind the door
        // So... by the end, my piece of paper will have the sum

        // paper: tracking variable
        // doors: array
        // opening a door, one by one: iteration

        // Tracking variables will be initialized before the loop itself

        // before we've opened the first door
        int sum = 0;
        // the process of opening each door
        for(int val : ar) {
            // the code inside here is what you do when you open a door
            // and see the value
            sum += val;
        }
        // after we've closed the last door
        System.out.println(sum);

        // Counting
        // Count the number of even values behind the doors

        // We use a piece of paper initially with 0 on it
        // then go to each door and check if the number is even,
        // if it is you increase the number on the paper by 1

        int cnt = 0;
        for(int val : ar) {
            if(val % 2 == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);

        // Finding the LARGEST value in the array

        // our piece of paper will have 0 on it initially,
        // we go to each door and check if the number behind the door
        // is greater than the number on our paper...
        // if it is, you change the number on the paper to the number
        // behind the door

        int max = Integer.MIN_VALUE;
        for(int val : ar) {
            if(val > max) {
                max = val;
            }
        }

        System.out.println(max);

        // Try to find the minimum value in the array

        int min = Integer.MAX_VALUE;

        for(int val : ar) {
            if(val < min) {
                min = val;
            }
        }

        System.out.println(min);

    }
}