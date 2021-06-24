package java_210624.jch;

import java.util.ArrayList;

public class Solution6 {
	 public int solution(int[] nums) {
	        int answer = -1;
	        
	        //nums에 중복되는 값 제거
	        ArrayList list = new ArrayList();
	        for(int i=0; i<nums.length;i++) {
	        	if(!list.add(nums[i]));
	        }
	        
	        int totalCount = 0;
	        int i = 2; //수정할 것 : nums에서 임의의 수를 꺼내서 더한 값
	        for (int j = 2; j*j <= i; j++) {
				if (i%j ==0) {
					break;
				}
				totalCount++;
			}
	        
	        System.out.println("Hello Java");

	        return answer;
	    }
	
	
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int [] a = {1,2,3,4};
		int [] a1 = {1,2,3,3,4};
		int [] b = {1,2,7,6,4};
		
		System.out.println(s.solution(a));
	}
	
}


