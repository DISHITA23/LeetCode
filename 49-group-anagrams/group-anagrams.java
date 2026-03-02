import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            
        
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}