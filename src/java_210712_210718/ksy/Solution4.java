package java_210712_210718.ksy;

import java.util.Scanner;

//정수 제곱근 판별
public class Solution4 {
	public long solution(long n) {
        long answer = 0;
        if(Math.pow(Math.sqrt(n), 2) == n) {
        	answer = (long) Math.pow(Math.sqrt(n)+1,2);
        }else {
        	answer = -1;
        }
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		long n = sc.nextInt();
		Solution4 s = new Solution4();
		s.solution(n);
	}
}
