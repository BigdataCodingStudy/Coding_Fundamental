package java_210712_210718.jch;

import java.util.Arrays;

public class Solution9 {
	
	public long solution(long n) {
        long answer = 0;
        
        long[] num = new long[(int)(Math.log10(n)+1)];
        for(int i=0; i<num.length; i++) {
        	num[i] = n%10;
        	n/=10; 
        }
        Arrays.sort(num);
        
        String ans = "";
        for(int i=num.length-1; i>=0; i--) {
        	ans += num[i];
        }
        answer = Long.parseLong(ans);
        return answer;
    }
	
	
    public static void main(String[] args) {
    	Solution9 s = new Solution9();
    	long x = 118372;
    	long y = 3247937;
    	System.out.println(s.solution(x));
    	System.out.println(s.solution(y));
    }
}
	
	
