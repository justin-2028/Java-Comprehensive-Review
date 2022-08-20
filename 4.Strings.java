class Main {
    public static void main(String[] args) {
        // Strings are anything in quotation marks

        // "" is different from ''
        // ^ for Strings        ^ for Characters

        String str = "hello";

        // ["h","e","l","l","o"]
        //   0   1   2   3   4

        // We cannot retrieve,change values
        // the same way that we in an array

        // str[0] does not work
        // str[0] = "y" does not work

        // Strings are a functional data structure
        // - it requires functions to properly utilize

        // Strings are also IMMUTABLE (CANNOT CHANGE)
        // - we are only able to recreate Strings

        // .charAt(index)
        // - grabs an individual character at the specified
        //   index of a String
        // Characters are numerical values represented
        // as letters
        // They can only be exactly one letter or space
        // or number or symbol

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));

        // Characters can be compared using basic
        // relational operators
        // - remember when comparing characters
        //   you have to use single quotes ' '

        if(str.charAt(0) == 'h') {
            System.out.println("First letter is an h!");
        }

        // Substring
        // .substring(startIndex, endingIndex)
        // .substring(startIndex) X

        // "hello"
        //  01234

        // I want to retrieve the "el" of "hello"

        // 1. figure out where it starts
        //    - in this case, "e" is at index 1
        // 2. figure out where it ends
        //    - in this case, "l" is at index 2
        // 3. add 1 to the last index
        //    - the last index becomes 3, and not 2

        // startIndex: 1
        // endIndex: 3

        // startIndex in INCLUSIVE
        // endIndex is EXCLUSIVE

        System.out.println(str.substring(1,3)); // "el"

        // A substring is a STRING and not a Character
        // Substrings are represented by ""

        // We cannot compare Strings like we do with
        // Characters

        System.out.println("hi" == "hi"); // true

        System.out.println(str.substring(1,3) == "el"); // false

        // .equals(otherString)
        // this is how we properly compare Strings
        System.out.println(str.substring(1,3).equals("el"));

        // REFACTORING
        // using variables to simplify your code
        String ss = str.substring(1,3);
        System.out.println(ss.equals("el"));

        // .length()
        // tells you the number of letter in a String

        System.out.println(str.length());

        // Strings do not have to be stored in variables
        // to utilize their functions

        System.out.println("hello".length());
        System.out.println("".length()); // 0

        str = "Hello World";
        //     012345678910

        // llo
        // str.substring(2,5);
        // o W
        // str.substring(4,7);
        // rld
        // str.substring(8,11);
        // World
        // str.substring(6,11);
        // Hello
        // str.substring(0,5);

        // As long as I know how long the substring is...
        // I can quickly identify the ending index by ADDING
        // the length of the substring to the starting index

        // How could find the proper String if I'm given a
        // variable that I have no idea what the String is

        int l = 3;

        // 1. identify the starting index
        // 2. add the length to the starting index

        System.out.println(str.substring(4, 4+l));

        // I want to find if this String exists in the
        // BEGINNING

        // I want to see if "He" is in the beginning
        // of "Hello World"

        ss = "He";

        System.out.println(str.substring(0, ss.length()));

        String rf = str.substring(0, ss.length());

        if(str.substring(0, ss.length()).equals(ss)) {

        }

        if(rf.equals(ss)) {

        }

        // I want to see if this String exists in the END

        // I want to see if "rld" is in the end of
        // "Hello World"

        ss = "rld";

        // How can we get 8 and 11 using ss.length()
        // and str.length()?

        // Hello World
        // 012345678910
        // str.length() - 11
        // ss.length() - 3

        // We can first get 11 by utilizing str.length()
        // We can get 8 by subtracting ss.length() from str.length()

        // startIndex: str.length() - ss.length()
        // endIndex: str.length()

        int len1 = str.length();
        int len2 = ss.length();
        rf = str.substring(len1 - len2, len1);
        System.out.println(rf.equals(ss));

        // str.substring(str.length() - ss.length(), str.length()).equals(ss);

        // Whenever thinking about the first X letters of a String
        // generally speaking, it will be something like .substring(0,X);
        // X being the length of the substring

        // Whenever thinking about the last X letters of a String
        // generally speaking, it will be something like .substring(length - X, length)
        // X being the length of the substring
        // length being the length of the original String

        // Concatenation
        // adding strings together

        System.out.println("123" + "456");

        // Anytime a NON String is added to a String...
        // it is converted into a String first

        System.out.println(123 + "456");
        System.out.println("123" + 456);

        // Order of operations is still a thing

        System.out.println(1 + 2 + 3 + "456");
        //                 3 + 3 + "456"
        //                 6 + "456"
        //                 "6" + "456"
        //                 "6456"
        System.out.println("123" + 4 + 5 + 6);
        //                 "123" + "4" + 5 + 6
        //                 "1234" + 5 + 6
        //                 "1234" + "5" + 6
        //                 "12345" + 6
        //                 "12345" + "6"
        //                 "123456"
        System.out.println("123" + (4 + 5 + 6));

        // Variables and concatenation

        int a = 5;

        System.out.println("1234" + a);

        String name = "Jane";

        System.out.println("Hi " + name + "!");
    }
}