package java_210712_210718.ksy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 나누어 떨어지는 숫자 배열
public class Solution2 {
	public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
        	if(arr[i]%divisor==0) answer.add(arr[i]);
        }
        
        if(answer.size()==0) answer.add(-1);
        System.out.println(answer);
        
        return answer;
    }

	
	/*
	public int[] solution(int[] arr, int divisor) {
		//코드 간결 but 실행시간 길다
		return Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
	}
	 */
	
	
	public static void main(String[] args) {
//		int arr[] = {5,9,7,10};
		int arr[] = {2, 36, 1, 3};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("divisor --> ");
		int div = sc.nextInt();
		Solution2 s = new Solution2();
		s.solution(arr, div);
		
//		System.out.println( Arrays.toString( s.solution(arr, 12) ));
	}
}
