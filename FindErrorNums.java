import java.util.Arrays;
public class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int n = nums.length;

        // Calculate the sum of numbers from 1 to n
        int sum = (n * (n + 1)) / 2;

        // Calculate the sum of nums array
        int arraySum = 0;
        for (int num : nums) {
            arraySum += num;
        }

        // Calculate the difference between the expected sum and the actual sum
        int diff = arraySum - sum;

        // Initialize an array to track the occurrence of each number
        boolean[] occurrence = new boolean[n + 1];

        // Iterate over the nums array
        for (int num : nums) {
            // If the number has already occurred, it is the duplicate number
            if (occurrence[num]) {
                result[0] = num;
            } else {
                occurrence[num] = true;
            }
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            // If a number is missing, it won't have occurred
            if (!occurrence[i]) {
                result[1] = i;
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}
