package java_210712_210718.ksy;

import java.util.Arrays;

// 제일 작은 수 제거하기
public class Solution7 {
	public int[] solution(int[] arr) {
		
		/*
		if(arr.length<=1) return new int[] {-1};
		int min = Arrays.stream(arr).min().getAsInt();
		
		return Arrays.stream(arr).filter(i -> i != min).toArray();
		 */
		
		
		if(arr.length<=1) {
			int answer[] = {-1};
			System.out.println(answer[0]);
			return answer;
		}
		
		int temp = 0;
		int[] answer = new int[arr.length-1];

		for(int i=0; i<arr.length; i++) {
			if(arr[temp]>arr[i]) {
				temp = i;
			}
		}
		
		for(int i=temp+1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = arr[i];
			System.out.print(answer[i]+" ");
		}
		return answer;
		
		
		/*
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			min = Math.min(min, arr[i]);
		}
		
		int answer[] = new int[arr.length-1];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==min) continue;
			answer[index++] = arr[i];
			System.out.print(answer[i]+" ");
		}
		
		return answer;
		 */
	}

	public static void main(String[] args) {
		int arr[] = {4,3,2,1};
		Solution7 s = new Solution7();
		s.solution(arr);
	}

}
