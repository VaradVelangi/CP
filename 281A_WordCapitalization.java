import java.util.Scanner;
 
public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.print(Character.toUpperCase((char)(int) a.charAt(0)));
        for (int i = 1; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
    }
}
