package cn.shgx.easy;

public class RomantoInteger {
	public static void main(String[] args) {
		System.out.println(romanToInt("DCXXI"));
		System.out.println(romanToInt("MMMDLXXXVI"));
	}
	static int romanToInt(String s) {
		int sum = 0;
		char c[] = s.toCharArray();
		for(int i = 0;i<c.length-1;i++) {
			if(toNumber(c[i])>=toNumber(c[i+1])) {
				sum += toNumber(c[i]);
			}else{
				sum -= toNumber(c[i]);
			}
		}
		sum += toNumber(c[c.length-1]);
		return sum;
	}
	static int toNumber(char ch) {  
        switch (ch) {  
            case 'I': return 1;  
            case 'V': return 5;  
            case 'X': return 10;  
            case 'L': return 50;  
            case 'C': return 100;  
            case 'D': return 500;  
            case 'M': return 1000;  
        }  
        return 0;  
    }  

}
