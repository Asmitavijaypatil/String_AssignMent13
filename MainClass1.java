import java.util.Scanner;

public class MainClass1 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder ComString = new StringBuilder();
        char Char1 = str.charAt(0);
        int count = 1;

    for (int i = 1; i < str.length(); i++) {
        char Char2 = str.charAt(i);

        if (Char2 == Char1) {
            count++;
        } else {
            ComString.append(Char1);
        if (count > 1) {
            ComString.append(count);
            }

            Char1 = Char2;
            count = 1;

           }

        }
        
        ComString.append(Char1);
        if (count > 1) {
            ComString.append(count);

        }

        System.out.println("Original string: " + str);
        System.out.println("Compressed string: " + ComString);
    }
}