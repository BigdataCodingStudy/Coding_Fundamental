package java_210712_210718.jch;

public class Solution8 {
	
	public int solution(int left, int right) {
        int answer = 0;
        for(int i =left; i<=right; i++) {
        	if(count(i)%2==0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        return answer;
    }
	
	public int count(int num) {
		int total = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) total +=1;
		}
		return total;
	}
	
	
    public static void main(String[] args) {
    	Solution8 s = new Solution8();
    	int x = 13;
    	int y = 17;
    	System.out.println(s.solution(x, y));
    }
}
	
	
