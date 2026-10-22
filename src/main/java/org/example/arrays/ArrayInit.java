package org.example.arrays;

/**
 * Input: nums = [2,7,11,15], target = 9
 *
 * Output: [0,1]
 *
 * Explanation:
 *
 * The sum of nums[0] and nums[1] is 2 + 7 = 9, which equals the target. Therefore, the indices [0, 1] are returned.
 *
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 *
 * Output: [1,2]
 *
 * Explanation:
 *
 * The sum of nums[1] and nums[2] is 2 + 4 = 6, which equals the target. Therefore, the indices [1, 2] are returned.
 *
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 *
 * Output: [0,1]
 *
 * Explanation:
 *
 * The sum of nums[0] and nums[1] is 3 + 3 = 6, which equals the target. Therefore, the indices [0, 1] are returned.
 */
public class ArrayInit {
    public int[] getTwoSum(int[] list, int target) {

        int res[] = new int[2];
        int pt1 = 0;
        int pt2 = 1;
        int size = list.length-1;

        while(pt1<=size && pt2<=size){
            if(list[pt1]+list[pt2] == target){
                res[0] = pt1;
                res[1] = pt2;
                return res;
            }
            pt2++;
            if(pt2 == size){
                pt1++;
                pt2 = pt1+1;
            }

        }

        return res;
    }
}
