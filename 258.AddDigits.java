package cn.shgx.easy;
/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits {
	public int addDigits(int num) {
        if(num<10) return num;
        int sum=0;
        while(num>0){
        	sum+=num%10;
        	num/=10;
        }
        return addDigits(sum);
    }
	public int addDigits1(int num) {
        if(num==0) return 0;
        return (num-1)%9+1;
    }
}

/*
//It is a simple math as output is required to be a single  digit i.e <=9
// also it is written => Could you do it without any loop/recursion in O(1) runtime?


class Solution {
    public int addDigits(int num) {
        return num < 10 ? num : num % 9 == 0 ? 9 : num % 9;  
    }
}



*/
