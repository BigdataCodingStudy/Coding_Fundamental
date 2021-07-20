package java_210712_210718.ksy;

import java.util.Scanner;

// 콜라츠 추측
public class Solution16 {
	public int solution(long num) {
        int answer = 0;
        
        while(num!=1 && answer!=500) {
            if(num%2==0) {
            	num /= 2;
            }else {
            	num = num*3 + 1;
            }
            answer++;
            
        }
        
        if(answer==500) answer = -1;
        
        System.out.println(answer);
        return answer;
    } 
	
	public static void main(String[] args) {
		Solution16 s = new Solution16();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		long n = sc.nextInt();
		s.solution(n);
	}
}
