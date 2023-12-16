// import java.util.Scanner;
// import java.util.Arrays;

// public class MainClass3 {
//     public static void main(String[] args){
//       Scanner sc = new Scanner(System.in);
//       String s = sc.nextLine();
      
//     public static boolean isPalindrome(String s) {
//         return true;
//      }
//      String original = s.replaceAll("a-zA-Z0-9","").toLowerCase();
//      StringBuilder sb = new StringBuilder(original);
//      sb.reverse();
//      boolean b = original.equals(sb.reverse().toString());
//      boolean result = isPalindrome(s);
//      if result {
//           System.out.println("The given string is palindrome");
//     }  else {
//         System.out.println("The given string is Not palindrome");
//     }  

//     }
// }

import java.util.Scanner;
import java.util.Arrays;

public class MainClass3 {

    public static boolean isPalindrome(String s) {
        String Str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(Str);
        return Str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter InputString: ");
        String inputString = sc.nextLine();
        boolean result = isPalindrome(inputString);

        if (result) {
            System.out.println("The given string is a valid palindrome TRUE ");
        } else {
            System.out.println("The given string is not a valid palindrome FALSE");
        }
    }
}