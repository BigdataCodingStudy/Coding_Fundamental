package java_210701_210711.kyw;

import java.util.ArrayList;

//소수만들기
public class Solution1 {

	public static boolean isprimed(int a) {
		boolean isp = false;
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				isp = true;
			}
		}

		return isp;
	}

	public int solution(int[] nums) {
		int answer = 0;

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				for (int j2 = 0; j2 < j; j2++) {

					if (!list.contains(nums[i] + nums[j] + nums[j2])) {
						if (isprimed(nums[i] + nums[j] + nums[j2]) == false) {
							list.add(nums[i] + nums[j] + nums[j2]);
							answer += 1;
						}

					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution1 s2 = new Solution1();
		int[] a = { 1, 2, 7, 6, 4 };
		System.out.println(s2.solution(a));

	}

}
