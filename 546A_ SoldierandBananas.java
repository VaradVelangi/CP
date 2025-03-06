import java.util.Scanner;
 
public class Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int w= sc.nextInt();
        int val=0;
        for (int i = 1; i<= w; i++) {
            val+=k*i;
        }
        int ans=Math.max(0,val-n);
        System.out.println(ans);
    }
}
