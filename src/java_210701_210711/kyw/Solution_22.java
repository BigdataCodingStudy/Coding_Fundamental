package java_210701_210711.kyw;

import java.util.ArrayList;
import java.util.Arrays;
//x만큼 간격이 있는 n개 숫자
public class Solution_22 {
	
	
	 public long[] solution(long x, long n) {
	        long[] answer = {};
	        ArrayList list = new ArrayList();
	    	
	    	for (int i = 1; i < n+1; i++) {
	    		list.add(x*i);
	    	}
	    	
	    	answer = new long[list.size()];
	    	for (int i = 0; i < answer.length; i++) {
	    		answer[i] = Long.parseLong(String.valueOf(list.get(i)));
	    	}
	        
	        return answer;
	    }
	 
	 
	 
	 /*
	  *    long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
	  * 
	  * */
	
	public static void main(String[] args) {
		Solution_22 s = new Solution_22();
	

	System.out.println(Arrays.toString(s.solution(4, 3)));
	
}
}
