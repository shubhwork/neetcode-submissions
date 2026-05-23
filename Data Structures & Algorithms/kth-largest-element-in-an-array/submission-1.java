class Solution {
    public int findKthLargest(int[] nums, int k) {
       Queue<Integer> queue=new PriorityQueue<>();
       for(int temp:nums){
        queue.add(temp);
        if(queue.size()>k){
            queue.poll();
        }
    }
    return queue.peek();
}
}