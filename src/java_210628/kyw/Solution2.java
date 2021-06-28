package java_210628.kyw;
//가운데글자 가져오기
public class Solution2 {

	public String solution(String s) {
		String answer = "";

		if (s.length() % 2 == 0) {

			answer = s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
		} else {
			answer = s.substring(s.length() / 2, s.length() / 2 + 1);

		}

		return answer;
	}

	public static void main(String[] args) {

		Solution2 s = new Solution2();
		System.out.println(s.solution("abcade"));

	}
}

