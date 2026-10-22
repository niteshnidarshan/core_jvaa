package org.example.arrays;

/***
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *
 * The overall run time complexity should be O(log (m+n)).
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */
public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res;
        int pt1 = 0;
        int pt2 = 0;
        int size1 = nums1.length;
        int size2 = nums2.length;
        int mergedArrSize = size1+size2;
        int mergedArr[] = new int[mergedArrSize];
        int newArrIndex = 0;

        while(pt1<size1 && pt2<size2){
            if(nums1[pt1]<nums2[pt2]){
                mergedArr[newArrIndex] = nums1[pt1];
                pt1++;
                newArrIndex++;
            } else{
                mergedArr[newArrIndex] = nums2[pt2];
                pt2++;
                newArrIndex++;
            }
        }
        while(pt1<size1){
            mergedArr[newArrIndex] = nums1[pt1];
            pt1++;
            newArrIndex++;
        }

        while(pt2<size2){
            mergedArr[newArrIndex] = nums2[pt2];
            pt2++;
            newArrIndex++;
        }

        for(int i: mergedArr){
            System.out.println("i: " + i);
        }
        boolean isEven = mergedArr.length%2==0?true:false;

        if(isEven){
            int medianIndex1 = (mergedArr.length/2)-1;
            int medianIndex2 = mergedArr.length/2;

            System.out.println("Median Index 1: " + medianIndex1 + " Median Index 2: " + medianIndex2);
            System.out.println(mergedArr[medianIndex1]);
            System.out.println(mergedArr[medianIndex2]);
            res = (mergedArr[medianIndex1]+mergedArr[medianIndex2])/2.0d;
            //res = (mergedArr[(mergedArr.length/2)-1] + mergedArr[(mergedArr.length/2)])/2.0;
        } else {
            res = mergedArr[(mergedArr.length/2)];
        }

        return res;

    }
}
