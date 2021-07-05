package java_210701_210711.ljh;
//가운데 글자 가져오기
/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
public class Solution4 {
    public String solution(String s) {
        String answer = "";
        
        String[] word = new String[s.length()]; //한글자씩 word 배열에 저장
        word = s.split("");
        
        if(word.length%2==0){   //글자수가 짝수면
            answer = word[(word.length/2) - 1] + word[word.length/2];
        }
        else{                   //글자수가 홀수면
            answer = word[word.length/2];
        }
        
        
        return answer;
    }
}