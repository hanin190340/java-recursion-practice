//task3
public class MaxFinder {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        int max = findMaxRecursive(numbers, 0);

        System.out.println("Finding the maximum number with a Recursive...");

        System.out.println("The maximum number is: " + max);
    }

    public static int findMaxRecursive(int[] nums, int index) {
        // Base case
        if (index == nums.length - 1) {
            return nums[index];

        }

        int maxi = findMaxRecursive(nums, index + 1);
        return Math.max(nums[index], maxi);

    }
}
