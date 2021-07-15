package java_210712_210718.ksy;

import java.util.ArrayList;


//같은 숫자는 싫어
public class Solution13 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 10; //0-9

		//간결...
		for(int i:arr){ 
			if(num!=i)
				list.add(i);
			num = i;
		}
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i).intValue();
		}
		
		/*
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=num) {
				list.add(arr[i]);
				num= arr[i];
			}
		}
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			answer[i]=list.get(i);
		}
		 */

		return answer;
	}
	
	public static void main(String[] args) {
		Solution13 s = new Solution13();
		int[] arr = {1,1,3,3,0,1,1};
		s.solution(arr);
		
	}
}
