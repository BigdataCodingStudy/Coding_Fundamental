package java_210719_210725.ksy;

import java.util.Arrays;

//정수 내림차순으로 배치하기
public class Solution3 {
	/*
		String res="";
	public long solution(int n) { // 이렇게 해야하는데...
        res ="";
        
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
        
	 */
        
	public long solution(long n) {
        String answer = "";
        String num = String.valueOf(n);
        char [] arr = new char[num.length()];
        
        for(int i=0; i<num.length(); i++) {
        	arr[i] += num.charAt(i);
        }
        
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--) {
        	answer += arr[i];
        }
        long result = Long.parseLong(answer);
        return result;
    }
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		System.out.println(s.solution(118372));
	}
}
