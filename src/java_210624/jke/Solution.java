package java_210624.jke;

//배열 평균
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0;i<arr.length;i++){
            answer += arr[i];
        }
        return answer = answer/arr.length;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Solution s = new Solution();
		System.out.println(s.solution(arr));
	}
}