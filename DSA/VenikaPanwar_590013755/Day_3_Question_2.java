import java.util.*;

public class CheckDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: {1 2 3 2}
        System.out.println("Enter array like this: {1 2 3 2}");
        String input = sc.nextLine();
        input = input.replace("{", "").replace("}", "");

        String[] parts = input.split(" ");
        HashSet<Integer> set = new HashSet<>();

        for (String part : parts) {
            int num = Integer.parseInt(part);
            if (set.contains(num)) {
                System.out.println("Output: true");
                return;
            }
            set.add(num);
        }

        System.out.println("Output: false");
    }
}
