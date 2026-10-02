// 题目:两数之和
// 难度:简单
// 思路:循环时用map存储nums数组和下标 对于每个元素查找map里面有没有target-nums[i] 只要n的时间复杂度
// 易错点：java语法和c++差距有点大 要先查再存 不然会查找到自己
// 复盘：第一次哈希用了两次循环 虽然也能过但是有点繁琐
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {

    }
}
