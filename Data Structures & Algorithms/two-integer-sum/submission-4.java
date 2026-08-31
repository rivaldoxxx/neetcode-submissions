class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> numbers=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int  missingInt=target-nums[i];
            if(numbers.containsKey(missingInt))
            {
                int index=numbers.get(missingInt);
                return  new int[]{index,i};
            }
            else{
                numbers.put(nums[i], i);
            }
        }
       return new int[]{};
    }
}
