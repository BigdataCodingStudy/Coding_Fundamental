package java_210719_210725.ksy;

// 소수 만들기
public class Solution5 {
	public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++) {
        	for(int j=i+1; j<nums.length; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			int sum = nums[i]+nums[j]+nums[k];
        			System.out.println(nums[i]+"+"+nums[j]+"+"+nums[k]+"="+sum);

        			int r = (int)Math.sqrt(sum);
        			System.out.println(r);

        			for(; r>1; r--) {
        				if(sum%r==0) break;
        			}
        			if(r==1) answer++;
        			System.out.println(r);
        			System.out.println(answer);
        		}
        	}
        }
        System.out.println(answer);
        return answer;
    }
	
	
	public static void main(String[] args) {
		Solution5 s = new Solution5();
//		int[] nums = {1,2,3,4};
		int[] nums = {1,2,7,6,4};
		s.solution(nums);
	}
}
