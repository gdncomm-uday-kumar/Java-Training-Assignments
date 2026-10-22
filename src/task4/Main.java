package task4;

public class Main {
    public static void checkNumber(int number) throws MoreThanOneDigitCustomExecption {
        if (number > 9 || number < -9) {
            throw new MoreThanOneDigitCustomExecption(number + " has more than one digit");
        }
        System.out.println(number + " is a single digit number");
    }

    public static void main(String[] args) {
        int[] numbers = {5, 42, -3, 100};

        for (int i = 0; i < numbers.length; i++) {
            try {
                checkNumber(numbers[i]);
            } catch (MoreThanOneDigitCustomExecption e) {
                System.out.println("More than one digit number: " + e.getMessage());
            }
        }
    }
}
