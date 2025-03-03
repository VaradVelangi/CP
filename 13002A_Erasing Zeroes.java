import java.util.Scanner;
 
public class Zeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i= 0;i<a;i++) {
            String s=sc.next();
            int first=s.indexOf('1'), last = s.lastIndexOf('1'), count = 0;
            if (first != -1) { 
                for (int j= first;j< last;j++) {
                    if (s.charAt(j) == '0') count++;
                }
            }
            System.out.println(count);
        }
    }
}
