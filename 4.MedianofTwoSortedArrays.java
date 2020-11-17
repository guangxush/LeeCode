/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] A, int[] B) {
	    int m = A.length, n = B.length;
	    int l = (m + n + 1) / 2;
	    int r = (m + n + 2) / 2;
	    return (getkth(A, 0, B, 0, l) + getkth(A, 0, B, 0, r)) / 2.0;
	}
	public double getkth(int[] A, int aStart, int[] B, int bStart, int k) {
		if (aStart > A.length - 1) return B[bStart + k - 1];            
		if (bStart > B.length - 1) return A[aStart + k - 1];                
		if (k == 1) return Math.min(A[aStart], B[bStart]);
	
		int aMid = Integer.MAX_VALUE, bMid = Integer.MAX_VALUE;
		if (aStart + k/2 - 1 < A.length) aMid = A[aStart + k/2 - 1]; 
		if (bStart + k/2 - 1 < B.length) bMid = B[bStart + k/2 - 1];        
	
		if (aMid < bMid) 
			return getkth(A, aStart + k/2, B, bStart,       k - k/2);// Check: aRight + bLeft 
		else 
			return getkth(A, aStart,       B, bStart + k/2, k - k/2);// Check: bRight + aLeft
	}
}


/*
Iterative approach

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int median = (n1+n2)/2;
        int temp[] = new int[n1+n2];
        
        int idx = 0;
        int pos1 = 0;
        int pos2 = 0;
        
        while(pos1<n1 && pos2<n2){
            if(nums1[pos1]<=nums2[pos2]){
                temp[idx] = nums1[pos1];
                pos1++;
            }
            else{
                temp[idx] = nums2[pos2];
                pos2++;
            }
            idx++;
        }
        while(pos1<n1){
            temp[idx] = nums1[pos1];
            idx++;
            pos1++;
        }
        while(pos2<n2){
            temp[idx] = nums2[pos2];
            idx++;
            pos2++;
        }
        
        if(idx%2==0)
            return (double)(temp[median-1]+temp[median])/2;
        else
            return temp[median];
    }
}




*/
/**
 * 对于一个长度为n的已排序数列a，若n为奇数，中位数为a[n / 2 + 1] , 
    若n为偶数，则中位数(a[n / 2] + a[n / 2 + 1]) / 2
    如果我们可以在两个数列中求出第K小的元素，便可以解决该问题
    不妨设数列A元素个数为n，数列B元素个数为m，各自升序排序，求第k小元素
    取A[k / 2] B[k / 2] 比较，
    如果 A[k / 2] > B[k / 2] 那么，所求的元素必然不在B的前k / 2个元素中(证明反证法)
    反之，必然不在A的前k / 2个元素中，于是我们可以将A或B数列的前k / 2元素删去，求剩下两个数列的
 k - k / 2小元素，于是得到了数据规模变小的同类问题，递归解决
    如果 k / 2 大于某数列个数，所求元素必然不在另一数列的前k / 2个元素中，同上操作就好。
*/
