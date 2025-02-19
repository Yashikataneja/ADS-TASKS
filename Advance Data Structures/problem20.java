import java.util.Stack;
public class problem20 {

    //given a string containing only characters '(',')','{','}','['and']',determine
    //if the input is valid

    public static boolean isVal(String s){
        Stack<Character>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty())return false;
                char top=stack.pop();
                if(ch==')'&&top!='('||
                (ch=='}'&&top!='{')||
                (ch==']'&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str="{[()]}";
        System.out.println("is valid "+isVal(str));
        str="{[(])]}";
        System.out.println("is valid"+isVal(str));
    }


    
}
