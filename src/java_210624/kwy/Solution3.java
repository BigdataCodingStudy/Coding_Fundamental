package java_210624.kwy;
//
//p와 y개수
public class Solution3 {

	public boolean solution(String s) {
		boolean answer = false;
		int countp = 0;
		int county = 0;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				countp += 1;
			} else if (s.charAt(i) == 'y') {
				county += 1;
			}
		}

		if (countp == county) {
			answer = true;
		} else {
			answer = false;
		}

		return answer;
	}

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution("pyPypy"));
		
		
	}
}
