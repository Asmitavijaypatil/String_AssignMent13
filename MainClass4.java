import java.util.Scanner;

class BalancedParanthesis {
      public static boolean isBalanced(String str2) {    
             boolean flag = true; 
             int count = 0; 
      
            for(int i = 0; i < str2.length(); i++){ 
                 if (str2.charAt(i) == '(') { 
                      count++; 
                } 
                else{ 
             
                      count--; 
                } 
                if (count < 0) { 
                       flag = false; 
                        break; 
                } 
            } 
            if (count != 0){ 
                 flag = false; 
            }
            return flag; 
     } 
}
 
public class MainClass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Paranthesis: ")
            String s1 = sc.nextLine(); 
     
            if (BalancedParanthesis.isBalanced(s1)) 
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");    
             
      }
}