package cn.shgx.easy;
/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerofTwo {
	//递归或循环，如果一个数是2的幂，则除以2肯定能整除，而且商肯定也是2的幂。
	public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        if(n>=2&&n%2==0)
        	return isPowerOfTwo(n/2);
        return false;
    }
	//位操作，如果一个数是2的幂，其2进制表示位置有且只有1个1，所以数1的个数。
	public boolean isPowerOfTwo1(int n) {
        if(n<=0)
        	return false;
        return countBit(n)==1;
    }
	public int countBit(int num) {
		int count = 0 ;
		while(num!=0) {
			count+=(num&1);
			num>>=1;
		}
		return count;
	}
	//位操作，如果一个数是2的幂，其2进制表示位置只有最高位1，则(n&n-1)==0
	public boolean isPowerOfTwo2(int n) {
        if(n<=0)
        	return false;
        return (n&(n-1))==0;
    }
	
}
