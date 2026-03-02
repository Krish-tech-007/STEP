public class Main{
    public static void main(String [] args){
        String s = "racecar";
        char arr [] = s.toCharArray();
        for(int i = 0; i<arr.length/2; i++){
            if(arr[i]!=arr[arr.length-i-1]){
                System.out.println("Not a palindrome");
                System.exit(0);
            }
        }
        System.out.println("Palindrome");
    }
}