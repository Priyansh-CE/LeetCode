import java.util.Scanner;

class Solution {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 2 ;
        int prev2 = 1;
        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        int ways = climbStairs(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
