package java_210623_start.ljh;
/*평균 구하기
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class Solution2 {
	public double solution(int[] arr) {
        double answer = 0;
        
        double sum = 0;
        for(int i=0; i<Double.valueOf(arr.length); i++){
            sum += arr[i];
        }
        
        answer = sum / arr.length;
        
        return answer;
    }
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		Solution2 s = new Solution2();
		System.out.println(s.solution(a));
	}
}
