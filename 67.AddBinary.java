package cn.shgx.easy;
/**
 * Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */
public class AddBinary {
	public static void main(String[] args) {
		System.out.println(addBinary("1","111"));
	}
	public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int temp=0;
        while(i>=0||j>=0) {
        	int x=0,y = 0;
        	if(i>=0) {
        		x = a.charAt(i--)-'0';
        	}
        	if(j>=0) {
        		y = b.charAt(j--)-'0';
        	}
        	if(x+y+temp<2) {
        		sb.append(x+y+temp);
        		temp = 0;
        	}else {
        		sb.append((x+y+temp-2));
        		temp = 1;
        	}
        }
        if(temp!=0) sb.append(temp);
        return sb.reverse().toString();
    }
}
