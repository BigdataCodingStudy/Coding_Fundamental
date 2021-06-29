package java_210628.jch;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution2 {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        ArrayList<Integer> gcd = new ArrayList<Integer>();
        ArrayList<Integer> lcm = new ArrayList<Integer>();
        
        //최대공약수
        for(int i=1; i<=Math.min(n,m); i++) {
        	if((n%i==0)&(m%i==0)) {
        		gcd.add(i);
        	}
        }
        answer[0] = gcd.get(gcd.size()-1);
        
        
        //최소공배수
        for(int i =Math.max(n, m); i<=n*m; i++) {
        	if((i%n==0)&(i%m==0)) {
        		lcm.add(i);
        	}
        }
        answer[1] = lcm.get(0);
        return answer;
    }
	
	// 다른 사람 풀이
	public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];

        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        return answer;
    }

   public static int gcd(int p, int q){
	   if (q == 0) return p;
	   return gcd(q, p%q);
   }
	
   
   
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		System.out.println(Arrays.toString(s.solution(3, 12)));
		System.out.println(Arrays.toString(s.solution(1, 10)));
		System.out.println(Arrays.toString(s.gcdlcm(3, 12)));
		System.out.println(Arrays.toString(s.gcdlcm(1, 10)));
		
	}
	
	
}
