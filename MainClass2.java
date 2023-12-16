import java.util.Scanner;

public class MainClass2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Old Character : ");
        String oldChar = sc.next();
        System.out.print("Enter New Character : ");
        String newChar = sc.next();

        String a = str.replace(oldChar, newChar);
        System.out.println("String after replacing chracter: "+a);

    }
}