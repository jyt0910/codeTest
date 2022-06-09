package cn.jyt;
//给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。

import java.util.HashSet;
import java.util.Set;

//输入: s = "abcabcbb"
//输出: 3
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
public class suanfa3 {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int length = 0;//表示a字母开始无重复字符的最长字串
            Set<Character> charSet = new HashSet<Character>();
            //这个起始字符肯定不重复
            charSet.add(s.charAt(i));
            //从这个字符的下一个字符起开始判断
            for (int j = i + 1; j < s.length(); j++) {
                length = charSet.size();
                if (!charSet.contains(s.charAt(j))) {
                    //如果加进来的字符不包括在集合中，则说明不重复
                    charSet.add(s.charAt(j));
                    length++;
                } else{
                    //存在重复终止，从下一个字符开始查找
                    break;
                }
            }
            //更新最长无重复字符串
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
