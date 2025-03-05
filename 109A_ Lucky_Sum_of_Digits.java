import java.util.Scanner;
public class Lucky {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        for (int i=0; 7 * i <= a;i++) {
            int remaining=a-(7 * i);
            if (remaining % 4 == 0) {
                int x=remaining / 4;
                System.out.println("4".repeat(x) + "7".repeat(i));
                return;
            }
        }
 
        System.out.println(-1);
    }
}
