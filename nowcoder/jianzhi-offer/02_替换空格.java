public class Solution {
    public String replaceSpace(StringBuffer str) {
        int oldLen = str.length();
        //记录空格数
        int spaceNum  = 0;
        for (int i = 0; i < oldLen; i++) 
            if (str.charAt(i) == ' ') spaceNum ++;
        int newLen = oldLen + 2 * spaceNum;
        
        //先扩容, 避免每次碰到空格都要调整整个数组
        str.setLength(newLen);
        //从原字符串尾往字符串头遍历
        int i = oldLen - 1, j = newLen - 1;
        int num = 0;
        while (num < spaceNum) {
            char ch = str.charAt(i);
            //从扩容后的数组向头部构造新数组
            if (ch == ' ') {
                str.setCharAt(j--, '0');
                str.setCharAt(j--, '2');
                str.setCharAt(j--, '%');
                num++;
            } else str.setCharAt(j--, ch);
            i--;
        }
        return str.toString();
    }
}