class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int temp[]=new int[nums1.length+nums2.length];
        int count=0;
        double median=0;
        for(int num:nums1){
            temp[count++]=num;
        }
        for(int num:nums2){
            temp[count++]=num;
        }
        Arrays.sort(temp);

        if(temp.length%2==0){
            median=(temp[temp.length/2-1]+temp[temp.length/2])/2.0;
        }
        else{
            median=temp[(temp.length-1)/2];
        }
        return median;
    }
}
