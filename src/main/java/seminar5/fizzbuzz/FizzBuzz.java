package seminar5.fizzbuzz;

public class FizzBuzz {

    private boolean isMultipleOfFive(int number){
        return number % 5 == 0;
    }
    private boolean isMultipleOfThree(int number){
        return number % 3 == 0;
    }

    public String evaluate(int number){
        if(isMultipleOfThree(number) && isMultipleOfFive(number)) {
            return "FizzBuzz";
        } else if(isMultipleOfThree(number)){
            return "fizz";
        } else if(isMultipleOfFive(number)){
            return "buzz";
        }
        return String.valueOf(number);
    }
}
