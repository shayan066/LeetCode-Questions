class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int forward=0, backward=0;
        for(int num : nums){
            forward +=num;
            if(forward==0)
            backward++;
        } 
        return backward;
    }
}
