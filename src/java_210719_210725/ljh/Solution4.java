package java_210719_210725.ljh;
//정수 제곱근 판별
/*
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class Solution4 {
    public long solution(long n) {
        long answer = 0;
        
        double x = Math.sqrt(n);
        
        double f = x;
        
        while(f>-1){
            
            if(f==0){
                answer = (long)((x+1)*(x+1));
            }
            else
                answer = -1;
            f-=1;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution4 s = new Solution4();
//		int[] arr = {3, 30, 34, 5, 9};
//		int[] arr = {0, 0, 0, 0, 0};
		String[] arr = {"Jane", "Kim"};
		int x = 2;
		int n = 121;
//		for(int i=0; i<arr.length-1; i++) {
			System.out.println(s.solution(n));			
//		}
	}
}


