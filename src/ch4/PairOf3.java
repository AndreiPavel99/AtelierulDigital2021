package ch4;

public class PairOf3 {
    public static void main(String[] args) {
       int y = 1;
       switch (y) {
           case 1:
               System.out.println("one player is playing this game.");
           case 2:
               System.out.println("two players are playing this game");
               break;
           default:
               System.out.println("you did not enter a valid value");
       }

        System.out.println(" " + y);
        System.out.println(PairOf3(new int[]{3, 5, 4, -8}));
    }

    private static Integer PairOf3 (int [] nums) {
        int count = 0;
        for (int i=0; i < nums.length - 2; i++) {
            for (int j=i+1; j<nums.length - 1;j++){
                for (int k=j+1; k<nums.length;k++){
                    if((nums[i]!=0)&&(nums[j]!=0)&&(nums[k]!=0)){
                        if(nums[i] + nums[j] + nums[k] == 0) {
                            count++;
                            nums[i] = 0;
                            nums[j] = 0;
                            nums[k] = 0;
                        }
                    }
                }

            }
        }
        return count;
    }
}
