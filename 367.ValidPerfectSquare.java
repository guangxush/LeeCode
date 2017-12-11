package cn.shgx.easy;
/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Note: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        for(int i=1;i<=num/2+1;i++) {
        	if(i*i==num)
        		return true;
        }
        return false;
    }
	public boolean isPerfectSquare1(int num) {
        int i = 1;
        while(num>0) {
        	num -= i;
        	i += 2;
        }
        return num==0;
    }
	public boolean isPerfectSquare2(int num) {
		 for(int i=1;i<=num/i;i++) {
	        if(i*i==num)
	           return true;
	     }
	     return false;
    }
	public boolean isPerfectSquare3(int num) {
		long left = 0,right = num;
		while(left<num) {
			long mid = left+(right-left)/2, t = mid*mid;
			if(t==num) return true;
			else if(t<num) left = mid +1;
			else right = mid-1;
		}
		return false;
   }
	public boolean isPerfectSquare4(int num) {
		long x  =num;
		while(x*x>num) {
			x =(x +num/x)/2;
		}
		return x*x==num;
   }
	public boolean isPerfectSquare5(int num) {
		long x  =num;
		while(x*x>num) {
			x =(x +num/x)/2;
		}
		return x*x==num;
   }
}
