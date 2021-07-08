package java_210701_210711.jke;

//문자열 다루기 기본
class Solution2 {
	public boolean solution(String s) {
		boolean answer = true;
		int len = s.length();
		
		if (len != 4 && len != 6) {
			return false;
		}
		for (int i = 0; i < len; i++) {
				char c = s.charAt(i);
				if (c < '0' || c > '9') {
					return false;
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String s1 = "a123";
		String s2 = "1234";

		System.out.println(s.solution(s1));
		System.out.println(s.solution(s2));
	}
}