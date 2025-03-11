/*find the first non repeating char in a string 
//"aabbcde"--->'c')
*/


import java.util.*;


public class nonRepeatingChar {
    public static char findnonRepeatingchar(String str){
        Map<Character, Integer> charCount=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            charCount.put(ch,charCount.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry : charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '\0';

    }
    public static void main(String[] args){
        String s="aabbcde";
        char res=findnonRepeatingchar(s);
        System.out.println(res!='\0' ? res : "Non repeating char ");

    }
    
}
