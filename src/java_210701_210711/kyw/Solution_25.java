package java_210701_210711.kyw;

//두개 뽑아서 더하기
import java.util.ArrayList;
import java.util.Arrays;

public class Solution_25 {

	public int[] solution(int[] numbers) {
		int[] answer = {};
		ArrayList list = new ArrayList();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if (!list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);
				}

			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) list.get(i);
		}

		Arrays.sort(answer);

		return answer;
		/*
		 *  HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < numbers.length-1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>(set);
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;*/
	}

	public static void main(String[] args) {
		Solution_25 s = new Solution_25();
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(s.solution(numbers)));

	}
}
