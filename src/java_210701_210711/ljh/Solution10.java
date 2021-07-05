package java_210701_210711.ljh;

//정수 제곱근 판별
/*
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */

public class Solution10 {
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
}
