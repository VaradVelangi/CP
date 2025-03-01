import java.util.Scanner;
public class Play{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++) {
            int b=sc.nextInt();
            if (b%3==1){
             System.out.println("YES");
            }else{
             System.out.println("NO");
            }
        }
    }
}
