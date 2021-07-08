package java_210701_210711.jke;


//최대공약수와 최소공배수
public class Solution6 {
	//프로그래머스 예제) n=2 m=5 설정
	public int[] solution(int n, int m) {
        int[] answer = {};
        if(n<m) { 
        	for(int i=1;i<m;i++) {
        		if(n%i==0 && m%i==0) {
        			answer[0] = i;
        			answer[1] = (n*m)/i;
        		}
        	}
        }else {
        	for(int i=1;i<n;i++) {
        		if(n%1==0 && m%2==0) {
        			answer[0] = i;
        			answer[1] = (n*m)/i;
        		}
        	}
        }
        return answer;
    }
}