public class TwoSum_1{
    public static void main(String []args){
        //twoSum();
        int [] array = {2,7,11,15};
        int target = 9;

        System.out.println(twoSum(array, target));


    }
    public static int[] twoSum(int [] nums, int target){
        //ArrayList l = new ArrayList();
        int retVal[];
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                else{
                    if(nums[i]+nums[j]==target){
                        retVal = new int[] {i,j};
                        return retVal;
                    }
                }

            }
        }
        // return l;
        return null;

    }



}
