package java_210628.jke;

//음양더하기
public class Solution2 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for (int i = 0; i < signs.length; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}

		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] a = {4,7,12};
		boolean[] b = {true, false, true};
		System.out.println(s.solution(a, b));
	}
}
