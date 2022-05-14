package interviewQuestions.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
//Grades are between 1-100(inclusive)
//If a grade is less than 3 points from the next multiple of 5, round up to the that next multiple of 5
//if a grade is below 38, it will remain failing so do not round up
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(gradingStudents(grades));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {

        //looping through the grades
        for(int i=0;i<grades.size();i++){
            //getting the next multiple of 5
            int pop= grades.get(i)+5;
            int next5 = pop-(pop%5);
            //checking if the grade is less than 38 or within 3 points of the next multiple of 5
            if(grades.get(i)>37&& (next5-grades.get(i))<3){
                //if so, rounding the grade up
                grades.set(i,next5);
            }
        }
        return grades;
    }
}

