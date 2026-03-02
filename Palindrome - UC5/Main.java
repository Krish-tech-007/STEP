import java.util.Stack;
public class Main{
    public static void main(String [] args){
        String s = "racecar";
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) != stack.pop()){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}