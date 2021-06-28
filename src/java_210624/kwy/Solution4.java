package java_210624.kwy;
  //
//문자열 다루기 기본
public class Solution4 {
	public boolean solution(String s) {
		boolean answer = false;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i)) == false) {
				count += 1;
			}
		}

		if (count != 0 && s.length() != 4 || s.length() != 6) {
			answer = false;
		} else {
			answer = true;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution4 s = new Solution4();

		System.out.println(s.solution("1234a3"));
	}

}
