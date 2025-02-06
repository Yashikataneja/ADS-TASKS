import java.util.*;

class problem784 {
  public List<String> letterCasePermutation(String s) {
    List<String> ans = new ArrayList<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(s);

    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i)))
        continue;
      
      int size = queue.size();
      for (int j = 0; j < size; j++) {
        String curr = queue.poll();
        char[] arr = curr.toCharArray();
        
        arr[i] = Character.toLowerCase(arr[i]); // Lowercase version
        queue.add(new String(arr));

        arr[i] = Character.toUpperCase(arr[i]); // Uppercase version
        queue.add(new String(arr));
      }
    }
    
    ans.addAll(queue);
    return ans;
  }

  public static void main(String[] args) {
    problem784 sol = new problem784();
    System.out.println(sol.letterCasePermutation("a1b2"));
  }
}

