package ch3;

public class PairOf2 {
    public static void main(String[] args) {
        System.out.println(PairOf2(new int[]{10, -10, 3, 10 , -3}));
    }

    private static Integer PairOf2 (int [] nums) {
        int count = 0;
        for (int i=0; i < nums.length - 1; i++) {
            for (int j=i+1; j<nums.length;j++){
                if((nums[i]!=0)&&(nums[j]!=0)){
                    count++;
                    nums[i]=0;
                    nums[j]=0;
                }
            }
        }
        return count;
    }
}
