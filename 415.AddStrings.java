package cn.shgx.easy;


/**
 *Given two non-negative integers num1 and num2 represented as string, 
 *return the sum of num1 and num2.
 *Note:
 *The length of both num1 and num2 is < 5100.
 *Both num1 and num2 contains only digits 0-9.
 *Both num1 and num2 does not contain any leading zero.
 *You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {
	public static void main(String[] args) {
		String num1 = "12345678";
		String num2 = "6789878";
		System.out.println(addStrings(num1,num2));
		System.out.println(addStrings1(num1,num2));
	}
    public static String addStrings(String num1, String num2) {
        if(num1.length()==0)return num2;
        if(num2.length()==0)return num1;
        boolean hasUp = false;//是否进位
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0||j>=0) {
        	int n1 = i>=0?num1.charAt(i)-'0':0;
        	int n2 = j>=0?num2.charAt(j)-'0':0;
        	int sum = n1+n2+(hasUp?1:0);
        	if(sum>=10) {
        		sb.insert(0, Integer.toString(sum-10));
        		hasUp = true;
        	}else {
        		sb.insert(0, Integer.toString(sum));
        		hasUp = false;
        	}
        	i--;
        	j--;
        }
        if(hasUp) sb.insert(0, "1");
        return sb.toString();
    }
    public static String addStrings1(String num1, String num2) {
       int i = num1.length()-1,j = num2.length()-1,carry = 0;
       String res = "";
       while(i>=0||j>=0) {
    	   if(i>=0) 
    		   carry +=num1.charAt(i--)-'0';
    	   if(j>=0)
    		   carry +=num2.charAt(j--)-'0';
    	   res = Integer.toString(carry%10)+res;
    	   carry/=10;
       }
       return carry!=0?"1"+res:res;
    }
}
