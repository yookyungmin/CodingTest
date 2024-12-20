package main.Lv1;

public class NickRule {
    public String solution(String nickname){

        String answer = "";
        for(int i = 0; i< nickname.length(); i++){
            if(nickname.charAt(i) == 'l') {
                answer += "I";
            }else if(nickname.charAt(i) == 'w'){
                answer += "vv";
            }else if(nickname.charAt(i) == 'W'){
                answer += "VV";
            }else if(nickname.charAt(i) == 'O'){
                answer += "O";
            }
        }
        while(answer.length() < 4){
            answer += 'o';
        }
        if(answer.length() > 8){
            answer = answer.substring(0, 8);
        }
        return answer;
    }
}
