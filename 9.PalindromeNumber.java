package cn.shgx.easy;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome1(32323));
	}
	public static boolean isPalindrome(int x) {
    	int num = x,sum=0;
    	if(num<0) return false;
    	while(num!=0) {
    		sum=sum*10+num%10;
    		num/=10;
    	}
        return sum==x;
    }
	public static boolean isPalindrome1(int x) {
    	int num = x,count = 1;
    	if(num<0) return false;
    	while(num/count>=10) {
    		count*=10;
    	}
    	while(x!=0) {
    		if(num/count!=x%10) return false;
    		x = x/10;
    		num = num-(num/count)*count;
    		count/=10;
    		System.out.println(num);
    		System.out.println(x);
    		System.out.println(count);
    	}
    	return true;
    }
}
