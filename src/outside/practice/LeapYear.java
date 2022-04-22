package outside.practice;
//Code to see if a year is a leap year
// if a year is multiple of 400 or multiple of 4 but not multiple of 100 then it's a leap year.
public class LeapYear {
    public static void main(String[] args) {

        for (int i = 2000; i <=2032 ; i++) {
            System.out.println(i+" is a leap year : "+leapYearCheck(i));
        }
    }
    public static boolean leapYearCheck(int year){
        return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
    }
}
