class Solution {
    public int vowelConsonantScore(String s) {
        int start = 0;
        int end = s.length() - 1;
        int v = 0;
        int c = 0;
        int score = 0;

        for(int i = start; i<=end; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                v +=1;
            }
            else if(Character.isDigit(s.charAt(i))){
                continue;
            }
            else if(s.charAt(i) == ' '){
                continue;
            }
            else{
                c +=1;
            }
        }

        if(c == 0){
            return 0;
        }
        else{
            score = v/c;
            return score;

        }


    }
}