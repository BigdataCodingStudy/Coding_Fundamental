package java_210712_210718.kyw;
//k번째수
import java.util.ArrayList;

import java.util.Collections;

class Solution {
    
	public int sub(int[]array,int[][]commands, int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sub = 0;
		for (int i = commands[n][0]-1; i < commands[n][1]; i++) {	
			list.add(array[i]);
			Collections.sort(list);
		}
		sub=(list.get(commands[n][2]-1));
		return sub;
		}
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
          ArrayList<Integer> answers =new ArrayList<Integer>();
	    	
	    	for (int n = 0; n < commands.length; n++) {
	    		answers.add(sub(array, commands, n));
	    	}
	    	answer = new int[answers.size()];
	    	for (int i = 0; i < answer.length; i++) {
				answer[i]=answers.get(i);
			}
        return answer;
    }
}
