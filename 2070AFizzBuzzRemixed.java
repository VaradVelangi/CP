import java.util.Scanner;
 
public class Fizzi{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0; i<a; i++) {
            int n=sc.nextInt();
            int count=(n / 15) * 3;
            for (int j=(n / 15) * 15; j <= n; j++) {
                if (j%3 == j%5)count++;
            }
 
            System.out.println(count);
        }
    }
}
