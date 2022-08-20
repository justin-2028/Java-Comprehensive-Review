class Main { // name of the class comes from the name of the file
    // this is the main method
    // this is the first thing that java will run when you run the java file
    public static void main(String[] args) {

        // Building blocks of programming
        // - Variables
        // - If Statements
        // - Loops
        // - Data Structures (Array)

        // These are Comments
        // These lines are ignored by the code editor

        // Printing
        // This is how we get stuff to show up in the
        // console

        // There are two variants
        System.out.println(123);
        System.out.println("David");

        System.out.print(123);
        System.out.print(456);

        // println will print whatever is in the parenthesis
        // and then put the cursor at the next line...

        // print will print whatever is in the parenthesis
        // and then keep the cursor at the same line...

        // Data Types
        // - int (Integer) - whole numbers
        // - double (Double) - anything with a decimal point (5.0)
        // - boolean (Boolean) - true / false
        // - String - anything in quotation marks

        // When declaring a variable... you have to declare
        // its data type

        // dataType variable_name = value;
        int x = 5;

        // Once a variable is declared, it cannot be declared again
        // String x = "hello"; this does not work
        // x = true; this does not work

        x = 10;

        // print statements can print out numbers... strings...
        // and variables

        System.out.println(x);

        // Operators
        // These are used to create expressions
        // Arithmetic, Relational, Logical

        // Arithmetic
        // + - * /
        // % - modulus

        System.out.println(5 + 5);

        // Follow order of operations
        // Parenthesis
        // Exponents
        // Multiplication Division Modulus
        // Addition Subtraction

        // If there is no order of operation being applied...
        // Java will evaluate the expressions left to right
        // AND Java can only evaluate one operator at a time

        System.out.println(1 + 2 + 3);
        // (1 + 2) + 3
        // 3 + 3
        // 6

        System.out.println(1 + 2 * 3);
        // 1 + (2 * 3)
        // 1 + 6
        // 7

        // evaluating = return

        // In Java... anytime a double is involved in an expression
        // the result will always be as a double

        System.out.println(5 / 1.7);

        // But... if only integers are involved... the answer will
        // always be an integer
        // Integers will always round down

        System.out.println(5 / 2);

        // Modulus
        // The remainder of division

        // 5 / 2 = 2.5 or 2 (1)/2

        // 5 - 2
        // 3 - 2
        // 1

        System.out.println(5 % 2);

        System.out.println(4 % 2); // 0
        System.out.println(7 % 3); // 1
        System.out.println(8 % 3); // 2
        System.out.println(9 % 3); // 0
        System.out.println(10 % 3); // 1
        System.out.println(11 % 3); // 2

        // 0 % anything is always divisible

        System.out.println(0 % 10);

        System.out.println(5 * 5 / 5);
        System.out.println(5 / 5 * 5);

        // Lets take a break until 2PM

        // Relational Operators
        // > < >= <=
        // == !=
        // Result in a boolean (true / false)
        // 5 > 2

        System.out.println(5 > 2);
        System.out.println(5 < 2);

        // = in Math represents equality
        // = in programming for assignment/change

        int y = 10;
        y = 15;

        // == in programming for equality
        System.out.println(5 == 5);
        System.out.println(5 == 4);
        // != in programming for inequality
        System.out.println(5 != 5); // false
        System.out.println(5 != 4); // true

        // Combining Relational operators with Arithmetic operators

        System.out.println(5 + 5 >= 15 - 5);

        // Arithmetic operators have priority over relational operators

        // (5 + 5) >= 15 - 5
        // 10 >= (15 - 5)
        // 10 >= 10
        // true

        // 5 < x < 15 this does not work in programming
        // Java evaluates one operator at a time

        // (5 < x) < 15
        // true < 15

        // Logical Operators
        // These operators allow us to combine multiple relational
        // operators
        // && (and) || (or) ! (not)

        // The && operator checks on both sides and evaluates
        // the relational expressions on each side and returns true
        // if both sides are true

        int z = 0;

        // 5 < z < 15

        System.out.println(5 < z && z < 15);

        // (5 < z) && z < 15
        //  false && (z < 15)
        //  false && true
        //  false

        // The || operator only needs at least one side to be true
        // for the entire expression to be true

        // z < 5 or z > 15

        // with or operators, be careful constructing expressions
        // that are always true

        System.out.println(z < 5 || z > 15);

        // Arithmetic > Relational > Logical

        // Within logical operators, && has precedence over the ||

        System.out.println(5 + 5 > 7 && 5 * 4 > 7 * 3);

        // 5 + 5 > 7 && (5 * 4) > 7 * 3
        // 5 + 5 > 7 && 20 > (7 * 3)
        // (5 + 5) > 7 && 20 > 21
        // (10 > 7) && 20 > 21
        // true && (20 > 21)
        // (true && false)
        // false

        System.out.println(5 * 2 / 3 > 12 % 8 || 7 + 2 * 3 ==  17 / 4);

        // (5 * 2) / 3 > 12 % 8 || 7 + 2 * 3 ==  17 / 4
        // (10 / 3) > 12 % 8 || 7 + 2 * 3 ==  17 / 4
        // 3 > (12 % 8) || 7 + 2 * 3 ==  17 / 4
        // 3 > 4 || 7 + (2 * 3) ==  17 / 4
        // 3 > 4 || 7 + 6 == (17 / 4)
        // 3 > 4 || (7 + 6) == 4
        // (3 > 4) || 13 == 4
        // false || (13 == 4)
        // (false || false)
        // false

        int a = 10;
        int b = 15;

        System.out.println(b < 10 || a > 5 && a < 10); // false

        // (b < 10) || a > 5 && a < 10
        // false || (a > 5) && a < 10
        // false || true && (a < 10)
        // false || (true && false)
        // (false || false)
        // false

        // ! not
        // negates the result of a boolean expression

        System.out.println(!true);
        System.out.println(!false);

        // This wraps up the basics of Java

        // The second building block is the if statement
        // This is where we begin to form logic

        // if(boolean expression) {

        // }

        // curly brackets will tell java what code belongs to what

        // anything that belongs to an if statement will only run
        // if the boolean expression in the parenthesis is true

        int c = 10;
        if(c > 5) {
            System.out.println(12345);
        }

        // every time you use the keyword if, it starts an if block
        // an if block is independent of every other if block

        // GOAL: is to learn more about the data that we are checking
        //       in the if statement

        // MINDSET: we do not know what the value of our variables are

        // else if / else
        // these extend if blocks

        // else if statements require another condition

        // else statements do not require a condition
        // true                 /        false
        if(c > 5) {             // c is greater than 5    c is equal to 5 or less than 5
            System.out.println(1);
        } else if(c < 5) {      // c is less than 5       c is equal to 5
            System.out.println(2);
        } else {                // c has to be 5
            System.out.println(3);
        }

        c = 10;

        if(c > 5) {
            System.out.println("big");
        }
        //-------------------------------
        if(c < 5) {
            System.out.println("small");
        } else {
            System.out.println("same");
        }

        // else if
        // every prior else if/if statement have to be false
        // for java to even check the else if statement
        // you can have any number of else if statements
        // else
        // every prior else if/if statement have tobe false
        // you can only have one else statement

        int grade = 95;

        // our goal is to create an if block where
        // we print the appropriate letter grade for the corresponding
        // number grade

        // grade - 90+  "A"
        // grade - 80-89 "B"
        // grade - -79   "C"

        // Create an if block where it prints the appropriate letter
        // grade based on grade

        if(grade >= 90) {
            System.out.println("A");
        } else if(grade >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}