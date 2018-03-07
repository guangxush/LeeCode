package cn.shgx.easy;
/**
 * You are given a string representing an attendance record for a student. 
 * The record only contains the following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than 
 * one 'A' (absent) or more than two continuous 'L' (late).
 * You need to return whether the student could be rewarded according to his attendance record.
 * Example 1:
 * Input: "PPALLP"
 * Output: True
 * Example 2:
 * Input: "PPALLL"
 * Output: False
 */
public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int cntA = 0,cntL=0;
        char[] record = s.toCharArray();
        for(char c : record) {
        	if(c=='A') {
        		if(++cntA>1)return false;
        		cntL=0;
        	}else if(c=='L') {
        		if(++cntL>2)return false;
        	}else{
        		cntL=0;
        	}
        }
        return true;
    }
    public boolean checkRecord1(String s) {
    	return !s.matches(".*LLL.*|.*A.*A.*");
    }
}
