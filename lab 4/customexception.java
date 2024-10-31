
// Custom Exception Class
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Method to check if a number is positive
    static void checkNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Number is negative. Please enter a positive number.");
        } else {
            System.out.println("The number is positive: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);  // Passing a negative number
        } catch (NegativeNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Test with a positive number
        try {
            checkNumber(10);  // Passing a positive number
        } catch (NegativeNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
