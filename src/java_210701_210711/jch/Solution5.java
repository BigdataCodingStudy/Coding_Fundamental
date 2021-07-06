package java_210701_210711.jch;


class Solution5 {
	public String solution(String[] seoul) {
        String answer = "";
        int index = 0;
        for(int i=0; i<seoul.length; i++) {
        	if(seoul[i].equals("Kim")) index = i;
        }
        //Method2
        //int index2 = Arrays.asList(seoul).indexOf("Kim");
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
    
    
    public static void main(String[] args) {
		Solution5 s = new Solution5();
		String [] seoul = {"Jeong", "Hong", "Kim", "Lee", "Jane"};
		
		System.out.println(s.solution(seoul));
	}
}
