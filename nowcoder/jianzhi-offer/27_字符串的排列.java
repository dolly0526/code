import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null) return res;
        
        char[] ch = str.toCharArray();
        PermutationCore(ch, 0, res);
        
        Collections.sort(res);
        return res;
    }
    
    private void PermutationCore(char[] ch, int idx, ArrayList<String> res) {
        if (idx == ch.length - 1) res.add(new String(ch));
        else {
            for (int i = idx; i < ch.length; i++) {
                //去重
                if (ch[idx] == ch[i] && i != idx)
                    continue;
                //先交换出去, 递归
                swap(ch, idx, i);
                PermutationCore(ch, idx + 1, res);
                //再换回来, 继续循环
                swap(ch, idx, i);
            }
        }
    }
    
    private void swap(char[] ch, int a, int b) {
        char tmp = ch[a];
        ch[a] = ch[b];
        ch[b] = tmp;
    }
}