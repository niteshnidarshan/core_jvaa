package org.example;

import org.example.arrays.ArrayInit;
import org.example.arrays.MedianOfTwoSortedArray;
import org.example.collection.Collection1;
import org.example.stream.TwoListAddition;
import org.example.twopointers.ListAdditionUsingTwoPointers;
import org.example.twopointers.PalindromWithTwoPointers;

import java.util.List;

class Main{
    public static void main(String[] args) {
        System.out.println("Jai Ram G ki");
        System.out.println("Hello World!");

//        Collection1 collection1 = new Collection1();
//        collection1.listExample();
//
//        PalindromWithTwoPointers palindromWithTwoPointers = new PalindromWithTwoPointers();
//        System.out.println(palindromWithTwoPointers.isPalindrom("PadmaamdaP"));

//        TwoListAddition twoListAddition = new TwoListAddition();
//        System.out.println(twoListAddition.addTwoSortedListsWithFlatMap(List.of(1,2,4,9), List.of(2,4,6,7)));
//        System.out.println(twoListAddition.addTwoSortedListsWithStreamsConcat(List.of(1,2,4,9), List.of(2,4,6,7)));

//        ListAdditionUsingTwoPointers listAdditionUsingTwoPointers = new ListAdditionUsingTwoPointers();
//        System.out.println(listAdditionUsingTwoPointers.addTwoSortedListsWithTwoPointers(List.of(1,2,4,9), List.of(2,4,6,7)));
//
//        ArrayInit arrayInit = new ArrayInit();
//        int[] result = arrayInit.getTwoSum(new int[]{1,2,3,4,5}, 9);
//        System.out.println("Indices: " + result[0] + ", " + result[1]);

        MedianOfTwoSortedArray  medianOfTwoSortedArray = new MedianOfTwoSortedArray();
        double res = medianOfTwoSortedArray.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4});
        System.out.println("Median: " + res);
    }
}