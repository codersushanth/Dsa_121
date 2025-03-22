package basic_array_problems;

public class product_of_array_self {
    static int[] product(int nums[]) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        // Step 1: Compute left products
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        // Step 2: Compute right products
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        // Step 3: Multiply left and right arrays
        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5, 10};
        int result[] = product(n); // Store the returned array

        // Print the correct output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
