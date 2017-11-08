package cn.shgx.easy;

import java.util.Arrays;

/**
 *Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
	public static void main(String[] args) {
		System.out.println(CountPrimes.countPrimes1(160));
		System.out.println(CountPrimes.countPrimes2(160));
	}
	public static int countPrimes(int n) {
		int count = 0;
        for(int i=2;i<n;i++) {
        	if(CountPrimes.isPrimes(i)) {
        		count++;
        	}
        }
        return count;
    }
	public static boolean isPrimes(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int countPrimes1(int n) {
		boolean[] notPrime = new boolean[n];
		int count = 0;
        for(int i=2;i<n;i++) {
        	if(notPrime[i]==false) {
        		count++;
            	for(int j=2;i*j<n;j++) {
            		notPrime[i*j]=true;
            	}
        	}
        }
        return count;
    }
	public static int countPrimes2(int n) {
		boolean[] Prime = new boolean[n];
		Arrays.fill(Prime, true);
        for(int i=2;i<n;i++) {
        	if(Prime[i]) {
        		int temp = i;
            	for(int j=i*temp;j<n;temp++) {
            		Prime[j]=false;
            		j=i*temp;
            	}
        	}
        }
        int count = 0;
        for(int i=2;i<n;i++) {
        	if(Prime[i])count++;
        	System.out.println(i+","+Prime[i]);
        }
        return count;
    }
}
