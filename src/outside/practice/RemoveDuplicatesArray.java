package outside.practice;

import java.util.ArrayList;

//Write a program to remove duplicates from an array in Java without using the Java Collection API.
// The array can be an array of String, Integer or Character,
// your solution should be independent of the type of array.
// If you want to practice more array-based questions, then see this list of top 30 array interview questions from Java interviews.
public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        ArrayList<Object> aL= new ArrayList<>();
        aL.add("java");
        aL.add("a");
        aL.add("b");
        aL.add("a");
        aL.add("java");
        aL.add(10.3);
        aL.add("c");
        aL.add(14);
        aL.add("java");
        aL.add(12);
        aL.add(12);
        aL.add(10.3);
        aL.add(14);

        System.out.println("Before: "+aL);
        for (int i=0;i<aL.size();i++){
            //iterating through the array
            for(int j=i+1;j< aL.size();j++){
                //iterating through the array, but comparing the object at i to the object at j, which is the next object
                //in the array. Since the j loop is nested, it will compare every object to the object at i. If it matches
                //it removes the duplicate in the j loop, and then decrements j so no object is missed.
                if(aL.get(i).equals(aL.get(j))){
                    aL.remove(j);
                    j--;
                }
            }
        }
        System.out.println("After: "+aL);
    }
}
