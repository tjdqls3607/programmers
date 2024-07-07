class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int i=0; i<code.length(); i++) {
            char c = code.charAt(i);
            
            if(mode==0) {
                if(c=='1'){
                    mode = 1;
                }else{
                    if(i%2==0) {
                        ret += c;
                    }
                }
            }else if(mode==1) {
                if (c=='1'){
                    mode = 0;
                }else {
                    if(i%2 != 0){
                        ret += c;
                    }
                }
            }
        }
        if (ret.isEmpty())
            return "EMPTY";

        return ret;
    }
}
