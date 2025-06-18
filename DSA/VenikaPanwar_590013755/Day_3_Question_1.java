import java.util.Scanner;

public class KFrequencySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input like {1 8 8 8 5 6 2}
        System.out.println("Enter array like this: {1 8 8 8 5 6 2}");
        String input = sc.nextLine();
        input = input.replace("{", "").replace("}", "");
        String[] parts = input.split(" ");

        int n = parts.length;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        // Step 2: Take k
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        // Step 3: Count frequency manually
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int current = nums[i];
            boolean isAlreadyCounted = false;

            // Check if we already counted this number
            for (int j = 0; j < i; j++) {
                if (nums[j] == current) {
                    isAlreadyCounted = true;
                    break;
                }
            }

            if (isAlreadyCounted) {
                continue;
            }

            // Count frequency
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == current) {
                    count++;
                }
            }

            // If frequency == k, add to sum
            if (count == k) {
                sum += current;
            }
        }

        // Step 4: Output
        System.out.println("Output: " + sum);
    }
}
