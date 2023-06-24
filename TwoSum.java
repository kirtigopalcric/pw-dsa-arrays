/*public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Iterate through the remaining elements
            for (int j = i + 1; j < n; j++) {
                // Check if the current pair of elements adds up to the target
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        // If no solution found, return an empty array
        return new int[0];
    }
}*/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(nums, target);
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Iterate through the remaining elements
            for (int j = i + 1; j < n; j++) {
                // Check if the current pair of elements adds up to the target
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        
        // If no solution found, return an empty array
        return new int[0];
    }
}