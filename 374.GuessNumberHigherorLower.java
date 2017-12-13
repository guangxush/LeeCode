package cn.shgx.easy;


/**
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.\
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * -1 : My number is lower
 * 1 : My number is higher
 * 0 : Congrats! You got it!
 */

public class GuessNumberHigherorLower {
	 public int guessNumber(int n) {
	    int low = 1;
	    int high = n;
	    int mid,result;
	    while(low<high) {
	    	mid  = low +(high-low)/2;
	    	result = guess(mid);
	    	if(result==1) {//表示猜小了
	    		low = mid+1;
	    	}else if(result==-1) {//猜大了
	    		high = mid-1;
	    	}else {
	    		return mid;
	    	}
	    }
	    return low;
	 }

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
