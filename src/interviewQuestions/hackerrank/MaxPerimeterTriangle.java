package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* Given an array of stick lengths, use 3 of them to construct a non-degenerate triangle with the maximum possible perimeter.

Return an array of the lengths of its sides as 3 integers in a non-decreasing order

If there are several valid triangles having the maximum perimeter:
1. choose the one with the longest maximum side
2. if more than one has that maximum, choose the one with the longest minimum side
3. if more than has that minimum as well, print any of them
* */


//I need to sort through combinations of 3 ints to find valid triangles
//then I need to find the perimeters of the those triangles
//then I need to compare the perimeters and find the max
//If some max perimeters are the same I need to find the one with the longest side
//If some of those have the same longest side, I need to find the one with the shortest side
public class MaxPerimeterTriangle {
    public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
        //create a new list to store the maxPerimeterTriangle sides
        List<Integer> ans = new ArrayList<>();
        //create a currentMax int and set it to the minimum int value
        long currentMax = Integer.MIN_VALUE;
        //check if the given List is too small to return a triangle(ie does not have even 3 ints)
        if (sticks.size() < 3) {
            //if so, return the failed req
            ans.add(-1);
        }
        //sort the sticks from smallest to largest
        Collections.sort(sticks);
        //loop through the sticks, stopping the loop before you'd run out of ints for a valid triangle
        for (int i = 0; i < sticks.size() - 2; i++) {
            //create a tempMax int
            long tempMax = 0;
            //if a+b>c
            if (sticks.get(i) + sticks.get(i + 1) > sticks.get(i + 2)) {
                //if b+c>d
                if (sticks.get(i + 1) + sticks.get(i + 2) > sticks.get(i)) {
                    //c+d>e
                    if (sticks.get(i + 2) + sticks.get(i) > sticks.get(i + 1)) {
                        //tempMax checks the perimeter of the viable triangle
                        tempMax = sticks.get(i) + sticks.get(i + 1) + sticks.get(i + 2);
                        //if the tempMax>currentMax
                        if (tempMax > currentMax) {
                            //set the tempMax to the currentMax
                            tempMax = currentMax;
                            //clear the answer list
                            ans.clear();
                            //add the side lengths
                            ans.add(sticks.get(i));
                            ans.add(sticks.get(i + 1));
                            ans.add(sticks.get(i + 2));
                        }
                    }
                }
            }
        }
        //if there were no non-degenerate triangles viable, return the failed req
        if (ans.isEmpty()) {
            ans.add(-1);
        }
        //else return the ans
        return ans;
    }
}
