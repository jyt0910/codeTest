package cn.jyt;

import java.util.Arrays;
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
//输入：nums = [2,7,11,15], target = 9
//输出：[0,1]
//解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
public class suanfa1 {
    public static void main(String[] args) {
//        int[] nums=new int[]{2,7,11,15};
//        int target=9;

//        int[] nums=new int[]{3,2,4};
//        int target=6;

        int[] nums=new int[]{3,3};
        int target=6;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
