package collection_problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

	public static void main(String[] args) {
	int nums[]= {5,6,1,8,2};
	int target=10;
	TwoSumProblem tsp=new TwoSumProblem();
	int result[]= tsp.twoSum(nums,target);
	System.out.println(Arrays.toString(result));
	
	}
	public int[] twoSum (int[]nums,int target) {
		Map<Integer,Integer> map=new HashMap<>();
		int n=nums.length;
		for(int i=0;i<n;i++) {
			int compliment=target-nums[i];
			if(map.containsKey(compliment)) {
				return new int[] {map.get(compliment),i};
			}
			map.put(nums[i],i);
		}
		return new int[] {};
	}
}
