package org.example;

import org.example.collection.Collection1;
import org.example.stream.TwoListAddition;
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

        TwoListAddition twoListAddition = new TwoListAddition();
        System.out.println(twoListAddition.addTwoSortedListsWithFlatMap(List.of(1,2,4,9), List.of(2,4,6,7)));
        System.out.println(twoListAddition.addTwoSortedListsWithStreamsConcat(List.of(1,2,4,9), List.of(2,4,6,7)));
    }
}