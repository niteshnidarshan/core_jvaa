package org.example.stream;

import java.util.List;
import java.util.stream.Stream;

public class TwoListAddition {
    //Given there are two sorted lists, write a program to add the two lists and return a new sorted list.
    // list1 = {1,2,4,9} list2 = {2,4,6,7}
    // out: {1, 2, 2, 4, 4, 6, 7, 9}
    public List<Integer> addTwoSortedListsWithFlatMap(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = Stream.of(list1, list2)
                .flatMap(List::stream)
                .sorted()
                .toList();
        return result;

    }

    public List<Integer> addTwoSortedListsWithStreamsConcat(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = Stream.concat(list1.stream(), list2.stream())
                .sorted()
                .toList();
        return result;
    }
}
