package java_210701_210711.kyw;
//나누어 떨어지는 배열
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};



		ArrayList list = new ArrayList();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0 ) {
				list.add(arr[i]);
			}
		}
		
		if(list.size()==0) {
			list.add(-1);
		}
		
		answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = (int) list.get(i);
		}
		
		Arrays.sort(answer);

		return answer;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {2, 5, 7, 10, 30, 15 };
		System.out.println(Arrays.toString(s.solution(arr, 9)));
			
			}


	}