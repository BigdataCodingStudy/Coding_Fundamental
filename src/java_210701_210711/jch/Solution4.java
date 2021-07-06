package java_210701_210711.jch;

import java.util.ArrayList;
import java.util.Arrays;

class Solution4 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(arr.length == 1) {
        	list.add(-1);
        }else {
        	int min = arr[0];
        	for(int i=0; i<arr.length; i++) {
        		if (min > arr[i]) {
    				min = arr[i];
    			}
        	}
        	for (int i=0; i<arr.length; i++) {
				if (arr[i] != min) {
					list.add(arr[i]);
				}
			}
        }
        
        answer = new int[list.size()];
		for (int i=0; i<answer.length; i++) {
			answer[i] = (int) list.get(i);
		}
		
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution4 s = new Solution4();
		int [] arr = {4,3,2,1};
		int [] arr2 = {10};
		System.out.println(Arrays.toString(s.solution(arr)));
		System.out.println(Arrays.toString(s.solution(arr2)));
	}
}
