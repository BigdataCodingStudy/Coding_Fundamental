package java_210726_210801.ljh;
//2016년
/*
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다. 
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 */

public class Solution {
    public String solution(int a, int b) {
        
        String answer = "";
        String[] day = new String[]{"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        switch(a){
            case 1:
                answer = day[b%7];
                break;
            case 2:
                answer = day[(31+b)%7];
                break;
            case 3:
                answer = day[(31+29+b)%7];
                break;
            case 4:
                answer = day[(31+29+31+b)%7];
                break;
            case 5:
                answer = day[(31+29+31+30+b)%7];
                break;
            case 6:
                answer = day[(31+29+31+30+31+b)%7];
                break;
            case 7:
                answer = day[(31+29+31+30+31+30+b)%7];
                break;
            case 8:
                answer = day[(31+29+31+30+31+30+31+b)%7];
                break;
            case 9:
                answer = day[(31+29+31+30+31+30+31+31+b)%7];
                break;
            case 10:
                answer = day[(31+29+31+30+31+30+31+31+30+b)%7];
                break;
            case 11:
                answer = day[(31+29+31+30+31+30+31+31+30+31+b)%7];
                break;
            case 12:
                answer = day[(31+29+31+30+31+30+31+31+30+31+30+b)%7];
                break;
        }
                
        
        return answer;
    }
    
    public static void main(String[] args) {
		Solution s = new Solution();
//		int[] arr = {3, 30, 34, 5, 9};
//		int[] arr = {0, 0, 0, 0, 0};
		int[] arr = {3, 30, 34, 4, 40, 42, 421, 423, 45};
		int x = 5;
		int n = 24;

//		for(int i=0; i<n; i++) {
			System.out.println(s.solution(x, n));			
//		}
	}
}