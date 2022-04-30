package interviewQuestions.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:
Input: list1 = [], list2 = []
Output: []
Example 3:
Input: list1 = [], list2 = [0]
Output: [0]*/
public class MergeTwoLists21 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
//        list2.add(3);
//        list2.add(4);
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> merged = new LinkedList<>();

        if (list1.isEmpty() && list2.isEmpty()) {
            return merged;
        } else if (!list1.isEmpty() && list2.isEmpty()) {
            merged.addAll(list1);
        } else if (list1.isEmpty() && !list2.isEmpty()) {
            merged.addAll(list2);
        } else {
            for (int i = 0; i < list1.size(); i++) {
                merged.add(list1.get(i));
                merged.add(list2.get(i));
            }
        }

        return merged;
    }
}