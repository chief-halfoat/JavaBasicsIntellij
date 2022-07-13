package interviewQuestions;

import java.util.Arrays;

public class ReverseStringButNotNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNotNumbers("test123pop346java545pyt"));
        System.out.println(reverse("stop"));
    }

    //So input String s=“test123pop346java545pyt”
    //the requirement is to reverse text in the string but not touch numbers so that we have
    //output “tset123pop346avaj545typ”

    public static String reverseNotNumbers(String input){
        String output="";
        String[] arr = input.split("(?<=[a-z])(?=[0-9])|(?<=[0-9])(?=[a-z])");

        for(String str:arr){
            if(str.matches("[a-z]+")){
                String temp = reverse(str);
                System.out.println(temp);
                output=output.concat(temp);
                continue;
            }
            output=output.concat(str);
        }
        return output;
    }
    public static String reverse(String input){
        String out = "";
        for(int i=input.length()-1;i>=0;i--){
            out=out+input.charAt(i);
        }
        return out;
    }
}
