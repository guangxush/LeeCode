package cn.shgx.easy;

import java.util.Arrays;

/**
 *Winter is coming! Your first job during the contest is to design a standard heater with fixed warm radius to warm all the houses.
 *Now, you are given positions of houses and heaters on a horizontal line, 
 *find out minimum radius of heaters so that all houses could be covered by those heaters.
 *So, your input will be the positions of houses and heaters seperately, 
 *and your expected output will be the minimum radius standard of heaters.
 *Note:
 *Numbers of houses and heaters you are given are non-negative and will not exceed 25000.
 *Positions of houses and heaters you are given are non-negative and will not exceed 10^9.
 *As long as a house is in the heaters' warm radius range, it can be warmed.
 *All the heaters follow your radius standard and the warm radius will the same.
 *Example 1:
 *Input: [1,2,3],[2]
 *Output: 1
 *Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, 
 *then all the houses can be warmed.
 *Example 2:
 *Input: [1,2,3,4],[1,4]
 *Output: 1
 *Explanation: The two heater was placed in the position 1 and 4. We need to use radius 1 standard, 
 *then all the houses can be warmed.
 */
public class Heaters {
    public int findRadius(int[] houses, int[] heaters) {
    	int n=heaters.length,j=0,res=0;
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	for(int i=0;i<houses.length;i++) {
    		int cur = houses[i];
    		while(j<n-1&&Math.abs(heaters[j+1]-cur)<=Math.abs(heaters[j]-cur)) {
    			++j;
    		}
    		res = Math.max(res, Math.abs(heaters[j]-cur));
    	}
    	return res;
    }
    public int findRadius1(int[] houses, int[] heaters) {
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	int max = 0;
    	for(int i=0;i<houses.length;i++) {
    		int left = 0;
    		int right = heaters.length-1;
    		while(left<right) {
    			int mid = left +(right-left)/2;
    			if(houses[i]>heaters[mid]) {
    				left = mid +1;
    			}else {
    				right = mid;
    			}
    		}
    		if(right==0) {
    			max = Math.max(max, Math.abs(heaters[right]-houses[i]));
    		}else {
    			int distances1 = Math.abs(heaters[right]-houses[i]);
    			int distances2 = Math.abs(houses[i]-heaters[right-1]);
    			max = Math.max(max, Math.min(distances1, distances2));
    		}
    	}
    	return max;
    }
}
