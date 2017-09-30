package cn.shgx.easy;
/**
Implement strStr().
Returns the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.
 *
 */
public class ImplementstrStr {
	public static void main(String[] args) {
		System.out.println(strStr("absdsdasdfsagaa","das"));
		System.out.println(strStr("aaa","aaaa"));
		System.out.println(strStr("mississippi", "issipi"));
		System.out.println(strStr("", ""));
	}
	public static int strStr(String haystack, String needle) {
		if(haystack.length()<needle.length()) {
			return -1;
		}
		int count = needle.length();
        for(int i=0;i<=haystack.length()-count;i++) {
        	if(haystack.substring(i, i+count).equals(needle)) {
        		return i;
        	}
        }
        return -1;
    }
}
