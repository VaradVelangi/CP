import java.util.Scanner;
public class Cap
{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String a= reader.next();
		char[] b=a.toCharArray();
		boolean c = true;
		for(int i=1; i<b.length; i++)
		    if(Character.isLowerCase(b[i]))
		        c = false;
		if(c == true)
		    for(int i=0; i<b.length; i++)
		        if(Character.isUpperCase(b[i]))
		           b[i] = Character.toLowerCase(b[i]);
		        else
		           b[i] = Character.toUpperCase(b[i]);
		for(int i=0; i<b.length; i++)
		    System.out.print(b[i]);
	}
}
