package string;

public class IsPalindrome {
    public boolean isPalindrom(String str){
        if(str.isEmpty()){
            return true;
        }
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }else{
                if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt))){
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
    }
    
}
