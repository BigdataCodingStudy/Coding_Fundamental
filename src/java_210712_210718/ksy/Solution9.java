package java_210712_210718.ksy;

import java.util.ArrayList;
import java.util.Arrays;

//두 개 뽑아서 더하기
public class Solution9 {
	public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		int temp = numbers[i] + numbers[j];
        		if(arr.indexOf(temp)<0) arr.add(temp);
        	}
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i]+" ");
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Solution9 s = new Solution9();
//		int[] numbers = {2,1,3,4,1};
		int[] numbers = {5,0,2,7};
		
		s.solution(numbers);
		
	}
}
