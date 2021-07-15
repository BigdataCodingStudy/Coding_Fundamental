package java_210712_210718.ksy;

// 핸드폰 번호 가리기
public class Solution15 {
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
	    
		for(int i = 0; i < ch.length - 4; i ++){
			ch[i] = '*';
		}
	    
		String answer = String.valueOf(ch);
	    System.out.println(answer);
		
	    return answer;
	    
	    
	    
		
//		return phone_number.replaceAll(".(?=.{4})", "*");
		
	    
	    
	    
	    /*
        String answer = "";
        
        for(int i=0; i<phone_number.length(); i++) {
        	if(i<phone_number.length()-4) {
        		answer += "*";
        	}else {
        		answer += phone_number.charAt(i);
        	}
        }
        System.out.println(answer);
        return answer;
        */
    }
	
	public static void main(String[] args) {
		Solution15 s = new Solution15();
//		String phone_number = "01012345678";
		String phone_number = "021234567";
		
		s.solution(phone_number);
	}
}
