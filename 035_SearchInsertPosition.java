import java.util.Arrays;
import java.util.Scanner;

class Solution {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Output: " + result);

        sc.close();
    }
}
