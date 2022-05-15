package interviewQuestions.hackerrank;

public class MarsExploration {
    public static void main(String[] args) {
        marsExploration("SOSSOSSOSSOSSOSLLL");
    }
    public static int marsExploration(String s) {
        // Write your code here
        int changes = 0;

        int multi=s.length()/3;
        String comparator = "SOS";
        for (int i = 1; i < multi; i++) {
            comparator+="SOS";
        }
        for(int j=0;j<s.length();j++){
            if(comparator.charAt(j)!=s.charAt(j)){
                changes++;
            }
        }
        return changes;
    }
}
