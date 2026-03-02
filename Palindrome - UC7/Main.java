import java.util.Stack;
import java.util.Queue;
import java.util.*;
public class Main{
    public static void main(String [] args){
        String s = "racecar";
        Deque<Character> dq = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            dq.add(s.charAt(i));
        }
        while(dq.size()>1){
            if(dq.removeLast() != dq.removeFirst()){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}