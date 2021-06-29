package java_210629_end.jch;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        /*
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor ==0) {
        			answer.add(arr[i]);
        	}
        }
        */
        
        for(int item : arr) {
        	if(item%divisor==0) {
        		answer.add(item);
        	}
        }
        
        
        
        if(answer.isEmpty()) {
        	answer.add(-1);
        }
        
        return answer;
    }
	
	
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int [] arr = {5,9,7,10};
		int div = 5;
		System.out.println(s.solution(arr,div));
		
		int [] arr2 = {2,26,1,3};
		int div2 = 1;
		System.out.println(s.solution(arr2,div2));
		
	}
}
