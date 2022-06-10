package interviewQuestions.leetCode;

public class ContainsDuplicate219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
