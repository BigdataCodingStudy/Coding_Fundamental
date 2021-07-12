package java_210712_210718.jch;

import java.util.*;

public class Solution3 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(arr[0]);
        for(int i=1; i<arr.length; i++) {
    		if(arr[i-1]!=arr[i]) {
    			list.add(arr[i]);
    		}
        }
        
        answer = new int[list.size()];
		for (int i=0; i<answer.length; i++) {
			answer[i] = (int) list.get(i);
		}
		
        return answer;
    }
    
    
    public static void main(String[] args) {
    	Solution3 s = new Solution3();
    	int []arr = {1,1,3,3,0,1,1};
    	System.out.println(Arrays.toString(s.solution(arr)));
    }
}
	
	

