package java_210712_210718.kyw;
//로또 순위 정하기
import java.util.Arrays;

public class lotto {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int count = 0;
		int zero = 0;
		int low = count;
		int high = 0;

		for (int i = 0; i < win_nums.length; i++) {
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					count += 1;
				}
			}
		}

		for (int i = 0; i < win_nums.length; i++) {
			if (lottos[i] == 0) {
				zero += 1;
			}
		}
		high = zero + count;
		low = count;

		if (count == 0)
			answer[1] = 6;
			answer[0] = 6;

		if (6 - high == 0)
			answer[0] = 1;
		if (6 - high == 1)
			answer[0] = 2;
		if (6 - high == 2)
			answer[0] = 3;
		if (6 - high == 3)
			answer[0] = 4;
		if (6 - high == 4)
			answer[0] = 5;
		if (6 - high == 5)
			answer[0] = 6;

		if (6 - low == 0)
			answer[1] = 1;
		if (6 - low == 1)
			answer[1] = 2;
		if (6 - low == 2)
			answer[1] = 3;
		if (6 - low == 3)
			answer[1] = 4;
		if (6 - low == 4)
			answer[1] = 5;
		if (6 - low == 5)
			answer[1] = 6;

		return answer;
	}

	public static void main(String[] args) {
		int[] lottos = { 1,2,3,4,5,6};
		int[] win_nums = { 7,8,9,10,11,12};
		lotto s = new lotto();


	}
}
