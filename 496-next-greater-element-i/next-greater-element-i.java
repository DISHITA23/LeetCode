import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> helperStack = new Stack<>();
        int[] nextGreaterElement = new int[nums2.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            if (helperStack.isEmpty()) {
                helperStack.push(element);
                nextGreaterElement[i] = -1;
                continue;
            }

            if (helperStack.peek() > element) {
                nextGreaterElement[i] = helperStack.peek();
                helperStack.push(element);
                continue;
            }

            while (!helperStack.isEmpty() && helperStack.peek() <= element) {
                helperStack.pop();
            }

            if (helperStack.isEmpty())
                nextGreaterElement[i] = -1;
            else
                nextGreaterElement[i] = helperStack.peek();

            helperStack.push(element);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], nextGreaterElement[i]);
        }

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}