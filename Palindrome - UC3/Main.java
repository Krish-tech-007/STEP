public class Main{
    public static void main(String [] args){
        String s = "racecar";
        for(int i = 0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}