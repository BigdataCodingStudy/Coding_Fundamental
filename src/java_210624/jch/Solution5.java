package java_210624.jch;


public class Solution5 {
	public String solution(int n) {
        String [] array = {"수", "박"};

		StringBuilder sb = new StringBuilder();
		
		if(n%2==0) {
			for(int i =0; i<n/2; i++) {
				sb.append(array[0]);
				sb.append(array[1]);
			}
		}else {
			for(int i = 1; i<=n/2; i++) {
				sb.append(array[0]);
				sb.append(array[1]);
			}
				sb.append(array[0]);
		}

		String answer = sb.toString();
        
        return answer;
    }
	
	
	// 다른 풀이
	public String solution2(int n) {

		StringBuilder answer = new StringBuilder();
		for(int i=1; i<=n;i++) {
			answer.append(i%2==1? "수":"박");
		}
        return answer.toString();
    }
	
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int a = 2;
		int b = 3;
		int c = 5;
		
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
		System.out.println(s.solution(c));
		
		System.out.println(s.solution2(c));
	}
	
}

