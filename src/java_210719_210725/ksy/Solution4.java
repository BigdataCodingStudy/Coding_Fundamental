package java_210719_210725.ksy;

//제일 작은 수 제거하기
public class Solution4 {
	public int[] solution(int[] arr) {

		int[] answer = {};
		int min = arr[0];
		if (arr.length == 1) {
			return new int[] { -1 };
		}
		for (int i = 0; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}
		answer = new int[arr.length - 1];

		int j = 0;
		for (int i = 0; i < answer.length; i++) {
			if (arr[j] == min) {
				j++;
				i--;
				continue;
			}
			answer[i] = arr[j];
			j++;
		}
	      
		/*
		if (arr.length <= 1) {
			int answer[] = { -1 };
			System.out.println(answer[0]);
			return answer;
		}

		int temp = 0;
		int[] answer = new int[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (arr[temp] > arr[i]) {
				temp = i;
			}
		}

		for (int i = temp + 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
			
		}

		for (int i = 0; i < answer.length; i++) {
			answer[i] = arr[i];
			System.out.print(answer[i]);
		}
		*/
		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] arr = {4,3,2,1};
//		int[] arr = {10};
		s.solution(arr);
	}
}
