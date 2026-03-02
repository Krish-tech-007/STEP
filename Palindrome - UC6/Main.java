import java.util.Stack;
import java.util.Queue;
import java.util.*;
public class Main{
    public static void main(String [] args){
        String s = "racecar";
        Stack<Character> stack = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i<s.length(); i++){
            stack.push(s.charAt(i));
            q.add(s.charAt(i));
        }
        for(int i = 0; i<s.length(); i++){
            if(q.remove() != stack.pop()){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}