class Solution {
    public int[] topKFrequent(int[] nums, int k) {//insert to map and count frequency
        Map<Integer,Integer> map=new HashMap<>();//find the highest count and add its key to list and also to set 
        for(int temp:nums){//now again find the higest which is not present in the set and also count the occurence
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int result[]=new int[k];
        
        for(int i=0;i<k;i++){
        int maxFreq=0;
        int element=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                element=entry.getKey();
            }
        }
        
        result[i]=element;
        map.remove(element);

        }
        return result;
    }
}
