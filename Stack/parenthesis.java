class parenthesis{
    public boolean isValid(String s) {
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(isopen(s.charAt(i))){
                ss.push(s.charAt(i));
            }
            else{
                if(ss.isEmpty()) return false;
                else if(!ismatch(ss.peek(),s.charAt(i))) return false;
                else ss.pop();
            }
        }
        return ss.isEmpty();
        
    }
    boolean ismatch(char a,char b){
       return a=='[' && b==']' || a=='{' && b=='}' || a=='(' && b==')' ;
    }
     boolean isopen(char a){
        return a=='[' || a=='{' || a=='(';
    }
}