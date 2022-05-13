package interviewQuestions.hackerrank;
/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.
Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
Example
Return '12:01:00'.
Return '00:01:00'.
Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):
string s: a time in  hour format
Returns
string: the time in  hour format
Input Format
A single string  that represents a time in -hour clock format (i.e.:  or ).

Constraints
All input times are valid
Sample Input
07:05:45PM
Sample Output
19:05:45
 */
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:02:00PM"));
    }
    public static String timeConversion(String s) {
        if(s.startsWith("12")&&s.contains("AM")){
            s="00"+s.substring(2,s.length()-2);
        }else if (!s.startsWith("12")&&s.contains("PM")){
            int hr = Integer.parseInt(s.substring(0,2));
            s=Integer.toString(hr+12)+s.substring(2,s.length()-2);
        } else {
            s=s.substring(0,s.length()-2);
        }
        return s;
    }

}
