import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            if (set.contains(nums[i])) {
                return true;
            }
            
            set.add(nums[i]);
            
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}
/* 
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            
            map.put(nums[i], i);
        }
        
        return false;
    }
}
    */