package org.example.twopointers;

import java.util.ArrayList;
import java.util.List;

public class ListAdditionUsingTwoPointers {
    //Given there are two sorted lists, write a program to add the two lists and return a new sorted list.
    // list1 = {1,2,4,9} list2 = {2,4,6,7}
    // out: {1, 2, 2, 4, 4, 6, 7, 9}

    public List<Integer> addTwoSortedListsWithTwoPointers(List<Integer> list1, List<Integer> list2) {
        // Implementation for adding two sorted lists using two pointers
        List<Integer> list = new ArrayList<>();
        int pt1 = 0;
        int pt2 = 0;
        while(pt1 < list1.size() && pt2 < list2.size()) {
            if(list1.get(pt1) <= list2.get(pt2)){
                list.add(list1.get(pt1));
                pt1++;
            } else {
                list.add(list2.get(pt2));
                pt2++;
            }

        }

        //add rest of greater element if available which could not add in the list
        while(pt1<list1.size()){
            list.add(list1.get(pt1));
            pt1++;
        }
        while(pt2<list2.size()){
            list.add(list2.get(pt2));
            pt2++;
        }

        return list;
    }
}
