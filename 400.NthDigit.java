package cn.shgx.easy;
/**
 *Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 *Note:
 *n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 *Example 1:
 *Input:
 *3
 *Output:
 *3
 *Example 2:
 *Input:
 *11
 *Output:
 *0
 *Explanation:
 *The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, 
 *which is part of the number 10.
 */
public class NthDigit {
	public int findNthDigit(int n) {
		// step 1. calculate how many digits the number has.
        long base = 9, digits = 1;
        while (n - base * digits > 0)
        {
            n -= base * digits;
            base *= 10;
            digits++;
        }

        // step 2. calculate what the number is.
        int index = (int) (n % digits);
        if (index == 0)
            index = (int) digits;
        long num = 1;
        for (int i = 1; i < digits; i++)
            num *= 10;
        num += (index == digits) ? n / digits - 1 : n / digits;;

        // step 3. find out which digit in the number is we wanted.
        for (int i = index; i < digits; i++)
            num /= 10;
        return (int) (num % 10);
    }
	public int findNthDigit1(int n) {
		 String res = "";
	     for (int i = 1; i <= n; i++)
	     {
	        res += i;
	        if (res.length() >= n)
	           return (res.charAt(n-1) - '0');
	     }
	     return (res.charAt(n-1) - '0');
    }
}
