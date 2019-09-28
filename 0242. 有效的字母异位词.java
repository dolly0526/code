class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        //用Map记录单词在s中出现的频率(本题也可以用字母计数器做)
        Map<Character, Integer> map = new HashMap<>();
        for (Character x : s.toCharArray()) map.put(x, map.getOrDefault(x, 0) + 1);
        
        //拿着刚才的Map到t中去检查个数, 若Map的值都变为0, 则相同
        for (Character x : t.toCharArray()) {
            Integer count = map.get(x);
            if (count == null || count == 0) return false;
            else map.put(x, count - 1);
        }
        return true;
    }
}