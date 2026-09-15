class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int temp:nums){
        map.put(temp,map.getOrDefault(temp,0)+1);
       }
       int []result=new int[k];
       for(int i=0;i<k;i++){
        int max=0;
        int element=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                element=entry.getKey();
            }
            }
            result[i]=element;
            map.remove(element);
        }
        return result;
    }
}
