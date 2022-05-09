package interviewQuestions.leetCode;
// Given the head of a sorted linked list,
// delete all duplicates such that each element appears only once.
// Return the linked list sorted as well.

//Input: head = [1,1,2]
//Output: [1,2]

//Input: head = [1,1,2,3,3]
//        Output: [1,2,3]

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public  class RemoveDuplicatesFromSortedList83 {
    public static List<Integer> deleteDuplicates(List<Integer> head) {
        HashSet<Integer> ints = new HashSet<>(head);
        head = new LinkedList<>(ints);
        return head;
    }

    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(1);
        head.add(2);

        LinkedList<Integer> head2 = new LinkedList<>();
        head2.add(1);
        head2.add(1);
        head2.add(2);
        head2.add(3);
        head2.add(3);

        System.out.println(deleteDuplicates(head));
        System.out.println(deleteDuplicates(head2));
    }
}
