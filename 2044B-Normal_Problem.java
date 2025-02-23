import java.util.ArrayList;
import java.util.Scanner;
 
public class Normal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String b= sc.next();
            StringBuilder c = new StringBuilder();
            for (int i = 0; i < b.length(); i++) {
                if(b.charAt(i)=='w')c.append("w");
                else if (b.charAt(i)=='p') {
                    c.append("q");
                }
                else{
                    c.append("p");
                }
            }
            c.reverse();
            System.out.println(c);
            t--;
        }
    }
}
