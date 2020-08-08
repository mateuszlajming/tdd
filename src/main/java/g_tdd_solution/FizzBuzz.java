package g_tdd_solution;

public class FizzBuzz {

  public String fizzBuzz(int number) {
    if(number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }

    return "Other";

    /*
    if(number % 3 == 0 && number % 5 == 0) {
      return "FizzBuzz";
    }
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }

    return null;
    */

    /*
    if(number == 15) {
      return "FizzBuzz";
    }
    if(number == 30) {
      return "FizzBuzz";
    }
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number % 5 == 0) {
      return "Buzz";
    }
    return null;
     */

    /*
    if(number % 3 == 0) {
      return "Fizz";
    }
    if(number == 5) {
      return "Buzz";
    }
    if(number == 10) {
      return "Buzz";
    }
    return null;
     */

    /*
    if(number == 3) {
      return "Fizz";
    }
    if(number == 9) {
      return "Fizz";
    }
    return null;
    */
  }
}
