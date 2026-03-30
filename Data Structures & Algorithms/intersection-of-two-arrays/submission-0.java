public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        for (int i : nums1) {
            for (int j : nums2) {
                if (i == j) {
                    res.add(i);
                    break;
                }
            }
        }
        int[] result = new int[res.size()];
        int idx = 0;
        for (int num : res) {
            result[idx++] = num;
        }
        return result;
    }
}