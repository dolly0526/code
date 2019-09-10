class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (Character x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        
        for (Character x : t.toCharArray()) {
            
            Integer count = map.get(x);
            if (count == null || count == 0) {
                return false;
            } else  {
                map.put(x, count - 1);
            }
        }
        return true;
    }
}