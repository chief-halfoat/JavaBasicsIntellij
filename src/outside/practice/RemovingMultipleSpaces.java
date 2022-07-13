package outside.practice;

public class RemovingMultipleSpaces {
    public static void main(String[] args) {
        String before = "   This is  a   test     to        see      what spaces will   be    removed";
        System.out.println(removeExtraSpaces(before));
    }
    public static String removeExtraSpaces(String before){
        String after = before.trim().replaceAll(" +"," ");
        return after;
    }
}
