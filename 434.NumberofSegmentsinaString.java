package cn.shgx.easy;
/**
 *Count the number of segments in a string, 
 *where a segment is defined to be a contiguous sequence of non-space characters.
 *Please note that the string does not contain any non-printable characters.
 *Example:
 *Input: "Hello, my name is John"
 *Output: 5
 */
public class NumberofSegmentsinaString {
    public int countSegments(String s) {
        if(s.length()==0||s.trim().isEmpty())
        	return 0;
        String str = s.trim();
        int j = 0;
        for(int i =0 ;i<str.length();i++) {
        	//上一个不是空格，当前的是空格
        	if(str.charAt(i)-'A'==-33&&str.charAt(i+1)-'A'!=-33) {
        		j++;
        	}
        }
        if(j==0) return 1;
        else return j+1;
    }
    public int countSegments1(String s) {
        int cnt = 0;
        for(int i =0;i<s.length();i++) {
        	if(i==0&&s.charAt(i)!=' ')cnt++;
        	if(i>0&&s.charAt(i)==' '&&s.charAt(i-1)!=' ')
        		cnt++;
        }
        return cnt;
    }
}
