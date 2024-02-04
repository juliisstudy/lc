package string;

public class IsSubsequence {
    public boolean subsequence(String strS, String strT){
        int i = 0;
        int strOneEnd = strS.length();
        int j= 0;
        int strTwoEnd = strT.length();
        while( i<strOneEnd &&j<strTwoEnd){
            if(strS.charAt(i)==strT.charAt(j)){
                i++;
                j++;
            }
            j++;
        }

        return j==strOneEnd;
    }
    
}
