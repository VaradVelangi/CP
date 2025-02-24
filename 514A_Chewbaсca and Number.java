import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String a=sc.next();
            String b= "";
            for(int i=0;i<a.length();i++){
                char c=a.charAt(i);
                if(c=='9' && i==0){
                    b+=""+c;
                } else if (c<'5') {
                    b+=""+c;
                }else{
                    b+=""+('9'-c);
                }
            }
            System.out.println(b);
        }
    }
