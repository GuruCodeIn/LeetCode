class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { numMap.get(complement), i };
            }
            
            // Store the number and its index in the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution (though the problem guarantees one solution)
        return new int[] {}; 
    }
}