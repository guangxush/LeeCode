package cn.shgx.easy;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0||strs==null) {
			return "";
		}
		for(int i=0;i<strs[0].length();i++) {
			char x = strs[0].charAt(i);
			for(int j=0;j<strs.length;j++) {
				if(strs[j].length()==i||strs[j].charAt(i)!=x) {
					return strs[0].substring(0, i);
				}
			}
		}
		return strs[0]; 
    }
	public static String longestCommonPrefix1(String...strs) {
		 if(strs.length==0||strs==null) {
				return "";
			}
			int num = strs[0].length();
			char[] c = strs[0].toCharArray(); 
			for(int i=1;i<strs.length;i++) {
				if(num>strs[i].length()) {
					num = strs[i].length();
					c = strs[i].toCharArray();
				}
			}
			for(int i=0;i<num;i++){ 
				for(int j=0;j<strs.length;j++) {
					if(c[i]!=strs[j].charAt(i))
						return strs[j].substring(0, i);
				}
			}
			return String.valueOf(c);
	}
	public static void main(String[] args) {
		System.out.println(longestCommonPrefix1("123","13","1"));
	}

}
