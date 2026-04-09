package greedy;

public class BrokenCalculator {

    public static int brokenCalc(int startValue, int target) {
        int operations = 0;

        while (target > startValue) {

            // If target is odd → make it even
            if (target % 2 == 1) {
                target += 1;
            } else {
                // If even → divide by 2
                target /= 2;
            }

            operations++;
        }

        // If target becomes smaller than startValue
        return operations + (startValue - target);
    }

    public static void main(String[] args) {
        System.out.println(brokenCalc(2, 3));  // Output: 2
        System.out.println(brokenCalc(5, 8));  // Output: 2
        System.out.println(brokenCalc(3, 10)); // Output: 3
    }
}
