package java_210701_210711.ljh;
//최대공약수와 최소공배수
/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 
 * solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
public class Solution6 {
    public int[] solution(int n, int m) {
        /*
        int[] answer = new int[2];
        
        //유클리드 알고리즘으로 했음.
        int r1, r2, t;  //r1 큰수, r2 = 작은수, t는 나머지.
        int gcd = 0;
        
        if(n < m){
            r1 = m;
            r2 = n;
        }
        else if(n > m){
            r1 = n;
            r2 = m;
        }
        else{   //두 수 같으면 둘다 최대공약수면서 최소공배수
            answer[0] = n;
            answer[1] = n;
            return answer;
        }
        
        while(r2 != 0){ //r2가 0이 되면 r1값이 최대공약수 gcd
            t = r1%r2;
            r1 = r2;
            r2 = t;
        }
        
        answer[0] = r1;
        answer[1] = n*m/r1;               
        
        return answer;
        */
        
        int[] answer = new int[2];
        
          int t = 1;
        int k = 0;
        
        int a = 0;
        
        if(n >= m)
            a = m;
        else
            a = n;
       
        
        for(int i = 1; i < a+1; i++){            
            if(m%i == 0 && n%i == 0){
                t = i;
            }
        }       
        
        k = (n*m)/t;        
        
        answer[0] = t;
        answer[1] = k;

        
        return answer;
    }
}