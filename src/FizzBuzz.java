/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        // for (int i = 1; i < 100; i++) {
        int i = 1;
        int end = 100;
        while (i <= end) {
            i = doFizzBuzz(i);

        }

    }

    public static int doFizzBuzz(int i) {
        // Note: we use "for" for "for loops" like in Python
        // set i = 1
        // seems like a while loop: while i < 100

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        // Note: assign variables to the solution of the modulo operations

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {
            // We use && instead of Python's "and"
            // "if" is the same as in Python

            System.out.println("Fizz Buzz");
            i = i + 1;

        } else if (divisibleBy3) {
            // We use "else if" instead of "elif"

            System.out.println("Fizz");
            i = i + 1;

        } else if (divisibleBy5) {

            System.out.println("Buzz");
            i = i + 1;

        } else {

            System.out.println(i);
            i = i + 1;

        }
        return i;
    }

}


//  Python Implementation:
//  def FizzBuzz
//  for i in 100:
//      if (i % 3) == 0 and (i / 5) == 0:
//          print('FizzBuzz')
//      elif i % 3 == 0
//          print('Fizz')
//      elif i % 5 == 0
//          print('Buzz')
//      else:
//          print(i)