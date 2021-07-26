package java_210726_210801.ljh;

//하샤드 수
/*
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
 * 예를 들어 18의 자릿수 합은 1+8=9이고, 
 * 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, 
 * solution을 완성해주세요.
 */

public class Solution4 {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;    //각 자릿수의 합
        int n = x;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        
        if(x%sum==0){   //나누어 떨어지면
            answer = true;
        }
        else
            answer = false;
        
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution4 s = new Solution4();
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		int[] arr = {1,1,3,3,0,1,1};
		int x = 5;
		int n = 10;

//		for(int i=0; i<s.solution(arr).length; i++) {
			System.out.println(s.solution(n));			
//		}
	}
}