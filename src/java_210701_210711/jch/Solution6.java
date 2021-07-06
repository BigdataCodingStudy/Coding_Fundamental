package java_210701_210711.jch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class Solution6 {
	public Integer[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
        			list.add(numbers[i]+numbers[j]);
        	}
        }
        if(numbers.length == 1) list.add(0);
		
		// 배열을 HashSet으로 변환
		HashSet<Integer> answerSet = new HashSet<>(list);
		// HashSet을 배열로 변환
		Integer[] resultAnswer = answerSet.toArray(new Integer[0]);
		
        Arrays.sort(resultAnswer);
        return resultAnswer;
    }
    
    public static void main(String[] args) {
		Solution6 s = new Solution6();
		int[] numbers = {2,1,3,4,1};
		int[] numbers2 = {5,0,2,7};
		int[] numbers3 = {0};
		
		System.out.println(Arrays.toString(s.solution(numbers)));
		System.out.println(Arrays.toString(s.solution(numbers2)));
		System.out.println(Arrays.toString(s.solution(numbers3)));
	}
}
