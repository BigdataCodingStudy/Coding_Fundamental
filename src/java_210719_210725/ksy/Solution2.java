package java_210719_210725.ksy;

// 약수의 개수와 덧셈
public class Solution2 {
	
	public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++) {
        	int count = 0;
        	for(int j=1; j<=i; j++) {
        		if(i%j==0) count++;
        	}
        	if(count%2==0) answer+=i;
        	else answer-=i;
        }
        
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
//		int left = 13;
//		int right = 17;
		
		int left = 24;
		int right = 27;
		
		s.solution(left, right);
	}
}
