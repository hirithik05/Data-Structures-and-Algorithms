package String;

public class ValidPallindrome {
    static boolean character(char ch){
        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    //Convert into lower case
    static char toLower(char ch){
        if(ch>='a' && ch<='z'|| ch>='0' && ch<='9'){
            return ch;
        }
        else{
            return (char)(ch+32);
        }
    }
    //valid or not
    static boolean isValid(String ch){
        int start = 0;
        int end = ch.length()-1;
        while(start<=end){
            if(ch.charAt(start)!=ch.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(character(ch)){
                sb.append(toLower(ch));
            }
        }
        return isValid(sb.toString());
    }
    public static void main(String[] args) {
    	ValidPallindrome obj = new ValidPallindrome();
    	String str = "A man, a plan, a canal: Panama";
    	System.out.println(obj.isPalindrome(str));
    	
    	
    }
}
