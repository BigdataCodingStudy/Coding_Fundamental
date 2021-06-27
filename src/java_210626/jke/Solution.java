package java_210626.jke;

//약수의 합
class Solution {
	public static void main(String[] args) {
		int sum = 0;
		int n = 12;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}