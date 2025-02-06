//The term permutation refers to a mathematical calculation of the number of ways a particular set can be arranged. Put simply, a permutation is a word that describes the number of ways things
// can be ordered or arranged.

//PERMUTATION 


public class stringPermutation {
    public static void generatePer(String str, String perm){
        if(str.isEmpty()){
        System.out.println(perm);
        return;
    }
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        String rem=str.substring(0,i)+str.substring(i+1);
        generatePer(rem,perm+ch);
    }

}
public static void main(String[] args) {
    String str="abc";
    System.out.println("Permutation of "+str+" is: ");
    generatePer(str,"");
}
        
    
}
