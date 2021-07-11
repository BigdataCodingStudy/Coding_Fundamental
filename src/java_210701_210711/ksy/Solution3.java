package java_210701_210711.ksy;
import java.util.Scanner;

//최대공약수와 최소공배수
public class Solution3 {

	//유클리드 호제법 사용
	private int gcd(int a, int b) {
		int c;
		while (b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}

	private int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	
	public int[] solution(int n, int m) {

		int[] answer = { gcd(n, m), lcm(n, m) };

		System.out.println(answer[0]);
		System.out.println(answer[1]);
		return answer;
		
		
        

		
		/*
		int[] answer = new int[2];
	      int temp=1;
	      int gcd=n*m;
	      while(temp!=0){
	        temp=m%n;
	        m=n;
	        n=temp;
	      }
	      answer[0]=m;
	      answer[1]=gcd/m;
        */
        
		
		
        /*
        int[] answer = new int[2];
        
        if(n<m) {
        	for(int i=1; i<m; i++) {
        		if(n%i==0 && m%i==0) {
        			answer[0] = i;
        			answer[1] = (m*n)/i;
        		}
        	}
        }else {
        	for(int i=1; i<n; i++) {
        		if(n%i==0 && m%i==0) {
        			answer[0] = i;
        			answer[1] = (m*n)/i;
        		}
        	}
        }
        
        System.out.println(answer[0]);
        System.out.println(answer[1]);
        return answer;
         */
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n: ");
		int n = sc.nextInt();
		System.out.println("m: ");
		int m = sc.nextInt();
		
		Solution3 s = new Solution3();
		s.solution(n, m);
	}
	
}
