import java.util.Scanner;

class Main {

    static int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            int index = (i + k) % nums.length;

            arr[index] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] result = rotateArray(nums, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
