package greedy;

public class JumpGame {
    public static boolean canJump(int[] arr)
    {
        int maxReach = 0;

        for (int i=0; i<arr.length;i ++)
        {
            if (i > maxReach)
            {
                return false;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums1 = {2,3,1,1,4};
        System.out.println(canJump(nums1)); // true

        int[] nums2 = {3,2,1,0,4};
        System.out.println(canJump(nums2)); // false
    }
}