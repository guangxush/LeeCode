package cn.shgx.easy;
/**
 * Write a program to check whether a given number is an ugly number.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.
 * Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
	 public boolean isUgly(int num) {
	     if(num<=0)return false;
	     int ret2 = num%2;
	     int ret3 = num%3;
	     int ret5 = num%5;
	     while(ret2==0||ret3==0||ret5==0) {
	    	 if(ret2==0) {
	    		 num/=2;
	    	 }else if(ret3==0) {
	    		 num/=3;
	    	 }else if(ret5==0) {
	    		 num/=5;
	    	 }
	    	 ret2 = num%2;
	    	 ret3 = num%3;
	    	 ret5 = num%5;
	     }
	     return num==1;
	 }
}
