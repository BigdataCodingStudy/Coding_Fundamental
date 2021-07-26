package java_210726_210801.ljh;

//같은 숫자는 싫어
/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 
 * 예를 들면,
 * 
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 */

import java.util.ArrayList;

public class Solution3 {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(arr[0]);
	    
	    //연속된 숫자들이 중복되지 않으면 새로운 리스트에 추가
        for(int i=1; i<arr.length; i++){
	        if(arr[i] != arr[i-1]){
	            list.add(arr[i]);
	        }
	    }
        
        int[] answer = new int[list.size()];
        
        //고대로 answer배열로 옮기기
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] a = {1,2,3,4};
		int[] b = {-3, -1, 0, 2};
		int[] arr = {1,1,3,3,0,1,1};
		int x = 5;
		int n = 45;

		for(int i=0; i<s.solution(arr).length; i++) {
			System.out.println(s.solution(arr)[i]);			
		}
	}
}