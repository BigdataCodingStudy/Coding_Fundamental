package java_210712_210718.jch;

public class Solution7 {
	public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++) {
        	if(isSosu(i)) answer++;
        }
        return answer;
    }
    
	private boolean isSosu(int num) {
		boolean isSosu = true;
		
		for (int i = 2; i*i <= num; i++) {
			if (num%i ==0) {
				isSosu = false;
				break;
			}
		}
		return isSosu;
	}
    
    public static void main(String[] args) {
    	Solution7 s = new Solution7();
    	int x = 10;
    	System.out.println(s.solution(x));
    }
}
	
	
