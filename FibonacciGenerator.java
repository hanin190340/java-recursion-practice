//task6
public class FibonacciGenerator {

    public static void main(String[] args) {
        int count = 10;
        System.out.println("Generating the first " + count + " Fibonacci numbers iteratively...");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacciRecursive(i) + " ");

        }
        System.out.println();
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
//the recursive step should return the sum of fibonacciRecursive(n - 1) and fibonacciRecursive(n - 2).
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);

    }
}
