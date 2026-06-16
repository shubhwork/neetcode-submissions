class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String temp[]=new String[strs.length];
        int count=0;
        List<List<String>> result=new ArrayList<>();
        Set<String> set=new HashSet<>();
       for(String str:strs){
        char []arr=str.toCharArray();
        Arrays.sort(arr);
        String s=new String(arr);
        temp[count++]=s;
       } 
       
       for(int i=0;i<temp.length;i++){
    List<String> list=new ArrayList<>();

    if(!set.contains(temp[i])){
        list.add(strs[i]);

        for(int j=i+1;j<temp.length;j++){
            if(temp[i].equals(temp[j])){
                list.add(strs[j]);
            }
        }

        result.add(list);
        set.add(temp[i]);
    }
}
       return result;
    }
}
