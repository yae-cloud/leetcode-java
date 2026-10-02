// 题目:最长连续序列
// 难度:中等
// 思路:遍历用set存储数组 提高查询速度 遍历set即可
// 易错点；遍历set要判断当前元素是否值得遍历
// 复盘：想用数列离散化来做发现复杂度太高
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>se=new HashSet<>();
        for(int num:nums){
            se.add(num);
        }
        int ans=0;
        for(int i:se){
            if(!se.contains(i-1)){
                int j=i+1;
                while(se.contains(j)){
                    j++;
                }
                ans=Math.max(ans,j-i);
            }
            continue;
        }
        return ans;
    }
    public static void main(String args){

    }
}
