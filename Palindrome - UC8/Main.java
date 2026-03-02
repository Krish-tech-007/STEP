import java.util.Stack;
import java.util.Queue;
import java.util.*;
public class Main{
    public static void main(String [] args){
        String s = "racecar";
       LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        while(list.size()>1){
            if(list.removeLast() != list.removeFirst()){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}