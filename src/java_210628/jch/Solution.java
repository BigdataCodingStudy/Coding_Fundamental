package java_210628.jch;


public class Solution {
	public int solution(int[] nums) {
		int answer = 0;
		int sum = 0;
		
		for(int i =0; i<nums.length-2; i++) {
			for(int j=i+1; j<nums.length-1; j++) {
				for(int k =j+1; k<nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if(isSosu(sum)) {
						answer++;
					}
				}
				
			}
		}
		
		return answer;
	}

	private boolean isSosu(int sum) {
		boolean isSosu = true;
		
		for (int i = 2; i*i <= sum; i++) {
			if (sum%i ==0) {
				isSosu = false;
				break;
			}
		}
		return isSosu;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int [] a = {1,2,3,4};
		int [] b = {1,2,7,6,4};
		System.out.println(s.solution(a));
		System.out.println(s.solution(b));
	}





}
