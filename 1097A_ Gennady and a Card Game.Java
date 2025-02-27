import java.util.Scanner;
 
public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        for (int i = 0; i < 5; i++) {
            String b= sc.next();
            if (b.charAt(0)==a.charAt(0) || b.charAt(1)==a.charAt(1)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
