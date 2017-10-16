package cn.shgx.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 [
      [1],
     [1,1],
    [1,2,1],
   [1,3,3,1],
  [1,4,6,4,1]
 ]
 */
public class PascalsTrangle {
	 public static void main(String[] args) {
		System.out.println(generate(5));
	 }
	 public static List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> lists= new ArrayList<>();
		 if(numRows==0)
			 return lists;
		 if(numRows>=1) {
			 List<Integer> list = new ArrayList<>();
			 list.add(1);
			 lists.add(list);
		 }
		 if(numRows>=2) {
			 List<Integer> list = new ArrayList<>();
			 list.add(1);
			 list.add(1);
			 lists.add(list);
		 }
		 if(numRows>=3) {
			 for(int i=3;i<=numRows;i++) {
		    	 List<Integer> list = new ArrayList<>();
		    	 List<Integer> pre = lists.get(i-1-1);//注意元素的编号，因为编号从0开始到i-1
		    	 list.add(1);//每一行第一个元素都为1
		    	 for(int j=1;j<i-1;j++) {
		    		 list.add(pre.get(j-1)+pre.get(j));
		    	 }
		    	 list.add(1);//每一行最后一个元素都为1
		    	 lists.add(list);
		     }
		 }
		 return lists;
	 }
}
