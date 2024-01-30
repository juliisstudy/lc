package sort;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram (String s,String t){
        HashMap<Character, Integer> map = new HashMap<>();
    int sl= s.length();
    int tl = t.length();
    if(sl!=tl){
        return false;
    }
    for(int i=0;i<sl;i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);
    }
    for(char c:map.keySet()){
        if(map.get(c)!=0){
            return false;
        }
    }
    return true;
    }

}
