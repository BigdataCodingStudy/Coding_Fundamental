package java_210719_210725.ljh;

import java.util.ArrayList;
public class Solution1 {
    public long[] solution(int x, int n) {
        
        long tmp;
        tmp = x;
        
        ArrayList<Long> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(tmp);
            tmp+=x;
        }
        
        long[] answer = new long[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
		Solution1 s = new Solution1();
//		int[] arr = {3, 30, 34, 5, 9};
//		int[] arr = {0, 0, 0, 0, 0};
		int[] arr = {3, 30, 34, 4, 40, 42, 421, 423, 45};
		int x = 2;
		int n = 5;
		for(int i=0; i<n; i++) {
			System.out.println(s.solution(x, n)[i]);			
		}
	}
}