package java_210712_210718.ksy;

// ﻿서울에서 김서방 찾기
public class Solution8 {
	public String solution(String[] seoul) {
		String answer = "";
		String Kim = "Kim";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals(Kim)) {
				answer = "김서방은 " + i + "에 있다";
				System.out.println(answer);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] seoul = { "Jane", "Park", "Kim", "Kimm" };
		Solution8 s = new Solution8();
		s.solution(seoul);
	}
}
