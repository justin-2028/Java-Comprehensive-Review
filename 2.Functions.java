class Main {
    public static void main(String[] args) {
        // FUNCTIONS

        // 1. where do we make functions
        // 2. how do we call them

        //--------We will call functions here------
        // A function will not do anything until you call it

        // use the name followed by the parenthesis
        // - within the parenthesis goes any values needed for
        //   the parameters

        printName();

        // functions are used to take repetitive chunks of
        // code and bind it to a single variable that we
        // can pass in different values to get different results

        returnName(); // THIS IS THE FUNCTION CALL
        // when something is return the function call
        // becomes whatever is returned

        String n = returnName();
        System.out.println(returnName());

        // A function call for a function that has parameters

        int sum = returnSum(5,6);
        System.out.println(sum);
        System.out.println(returnSum(10,20));

        System.out.println(returnDouble(10));
        System.out.println(returnDouble(4));
        System.out.println(returnDouble(17));

        System.out.println(returnRemainder(10,3));
        System.out.println(returnRemainder(6,3));
        System.out.println(returnRemainder(1,3));

        System.out.println(returnBig(5, 6));
        System.out.println(returnBig(10, 6));
    }

    //-------Put functions here-------

    // Declaring a function

    // method header

    // visibility static return_type name(parameters)
    // - visiblity: accessibility of the function
    // - static: this defines a variable as belonging to the class
    // - return type: if it returns something, this will its data type
    //                if it does not return, this will be void
    // - name: some unique name
    // - parameters: inputs that we define as variables

    static void printName() {
        System.out.println("David");
    }

    // the return keyword

    // 1. it ends the function (MOST IMPORTANT)
    // 2. it gives back to the function call something

    // whenever you return something, the return type
    // has to match the data type of whatever you are returning
    static String returnName() {
        return "David";
        // any code beyond this point is UNREACHABLE CODE
    }

    // we'll make a function that returns the sum of A and B
    // each parameter must be declared a data type
    // multiple parameters must be separated by commas
    static int returnSum(int A, int B) {
        return A + B;
    }

    // Create a function called returnDouble that takes
    // an integer parameter called a and returns DOUBLE its value

    static int returnDouble(int a) {
        return a * 2;
    }

    // Create a function called returnRemainder that takes two
    // integar parameters, a and b, and returns the modulus remainder
    // of a / b

    static int returnRemainder(int a, int b) {
        return a % b;
    }

    // Test them out with different inputs to make sure they work

    // Conditional return statements

    static int returnBig(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    // As programmers, data types by themselves do not mean much

    // Its important that we give context to our data so that
    // we can utilize them better to find solutions

    // integers

    // its too hot if the temperature is above 90 degrees.
    // return true if the weather is too hot
    // return false if otherwise

    static boolean tooHot(int temp) {
        if(temp > 90) {
            return true;
        } else {
            return false;
        }
    }

    // booleans

    // booleans can only be true / false
    // - is or is not
    // - has or does not have
    // - yes or no

    // real context
    // - it is the weekend or it is not the weekend
    // - it is too hot or it is not too hot

    // if it is the weekend its relax time
    // if it is not the weekend, its study time

    // print relax time if we can relax
    // print study time if we cannot relax

    static void canWeRelax(boolean isWeekend) {
        if(isWeekend == true) {
            System.out.println("relax time");
        } else {
            System.out.println("study time");
        }
    }
}