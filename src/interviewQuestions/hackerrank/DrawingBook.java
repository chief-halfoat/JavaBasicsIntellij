package interviewQuestions.hackerrank;

public class DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(10,2));
        System.out.println(pageCount(10,4));
        System.out.println(pageCount(10,6));
        System.out.println(pageCount(10,8));
    }
    public static int pageCount(int n, int p) {
        //find the mid-point of the book
        int a = n / 2;
        //find the target number of page turns, since the desired page number is p and there are 2 pages exposed per turn
        int b = p / 2;
        // find the number of page turns needed from the end of the book
        int c = a-b;
        //returning the smaller number
        if (b >= c) {
            return c;
        } else {
            return b;
        }
    }
}
