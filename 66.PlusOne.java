package cn.shgx.easy;
/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	public static void main(String[] args) {
		//int[] test = plusOne(new int[] {9,9,9,9,9});
		int[] test = plusOne1(new int[] {8,9,6,9,9});
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}	
	}
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		int count = 1;
        for(int i=n-1;i>0;i--) {
        	if(digits[i]+1>=10) {
        		digits[i]=(digits[i]+1)%10;
        		digits[i-1]+=(digits[i]+1)/10;
        		count++;
        	}else {
        		digits[i]++;
        		return digits;
        	}
        }
        if(count==n&&++digits[0]>=10) {
        	int[] result = new int[n+1];
        	result[0]=digits[0]/10;
        	result[1]=digits[0]%10;
        	for(int i=2;i<n;i++) {
        		result[i]=digits[i-1];
        	}
        	return result;
        }else {
        	return digits;
        }
    }
	public static int[] plusOne1(int[] digits) {
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
}
