import java.util.Scanner;
 
public class NewWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n= sc.nextInt();
            int k=sc.nextInt();
            int p= sc.nextInt();
            int min=(int)Math.ceil((double) Math.abs(k) / p);
            if (min<= n) {
                System.out.println(min);
            } else {
                System.out.println("-1");
            }
        }
    }
}
