class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        
        for(int i=0; i<code.length(); i++) {
            if(mode==0) {
                if(code.charAt(i) == '1') mode = 1;
                else if (code.charAt(i) != '1' && i%2==0) {
                    ret.append(code.charAt(i));
                }
            } else {
                if(code.charAt(i) == '1') mode = 0;
                else if(code.charAt(i) != '1' && i%2!=0) {
                    ret.append(code.charAt(i));
                }
            }
        }
        
        if(ret.length() == 0) ret.insert(0, "EMPTY");
        
        return ret.toString();
    }
}