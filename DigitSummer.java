//task8 
public class DigitSummer {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumDigitsRecursive(number);

        System.out.println("Calculating the sum of digits for " + number + " with a Recursive...");


        System.out.println("The sum of the digits is: " + sum);
    }

    public static int sumDigitsRecursive(int number) {
        if (number == 0) {
            return 0;
        }
        //The recursive step should return the last digit (number % 10) added to the sum of the remaining digits (which you get by calling the function with number / 10)
        return number % 10 + sumDigitsRecursive(number / 10);

    }
}

