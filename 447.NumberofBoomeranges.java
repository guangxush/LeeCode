package cn.shgx.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).
 *Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).
 *Example:
 *Input:
 *[[0,0],[1,0],[2,0]]
 *Output:
 *2
 *Explanation:
 *The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class NumberofBoomeranges {
    public int numberOfBoomerangs(int[][] points) {
        int result = 0;
        for(int i=0;i<points.length;i++) {
        	int x = points[i][0];
        	int y = points[i][1];
        	Map<Long, Integer> map = new HashMap<>();
        	for(int j=0;j<points.length;j++) {
        		int x1 = points[j][0];
        		int y1 = points[j][1];
        		long dist = (x1-x)*(x1-x)+(y1-y)*(y1-y);
        		if(map.containsKey(dist)) {
        			map.put(dist, map.get(dist)+1);
        		}else {
        			map.put(dist, 1);
        		}
        	}
        	for(Map.Entry<Long, Integer> entry:map.entrySet()) {
        		int val = entry.getValue();
        		result += val*(val-1);
        	}
        }
        return result;
    }
}
