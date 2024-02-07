package string;

public class ReverseWordsInString {
    public String reverseString(String s){
        String[] words = s.trim().split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            if(!words[i].isEmpty()){
                result.append(words[i]).append("");
            }
        }
        return result.toString().trim();
    }    
}
