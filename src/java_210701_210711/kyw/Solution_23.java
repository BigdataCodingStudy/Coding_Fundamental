package java_210701_210711.kyw;

import java.util.ArrayList;
import java.util.Arrays;
//배열에서제일 작은 수 제거하기
public class Solution_23 {
	public int[] solution(int[] arr) {

		int[] answer = {};
		ArrayList list = new ArrayList();
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		if (arr.length == 1) {
			list.add(-1);
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != min) {
					list.add(arr[i]);
				}
			}

		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		Solution_23 s = new Solution_23();
		int[] arr = { 9, -1, 1, 3, 5, 2, 4, 7 };

		System.out.println(Arrays.toString(s.solution(arr)));

	}

}
