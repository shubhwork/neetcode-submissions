class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] product=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int result=1;
            int temp=nums[i];
             int count=0;
            for(int j=0;j<nums.length;j++){ 
                if(nums[j]==temp && count==0){
                    count++;
                    continue;
                }
                else{
                    result*=nums[j];

                }
            }
            product[i]=result;
        }
        return product;
    }
}  
