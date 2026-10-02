// 题目:字母异位词分组
// 难度:中等
// 思路:题目没有重复直接排序字符串再用哈希把每一种词组分组就行
// 易错点：string不能更改要转换成char的数组

import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char []str=s.toCharArray();
            Arrays.sort(str);
            String sorts=new String(str);
            map.computeIfAbsent(sorts, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {

    }
}
