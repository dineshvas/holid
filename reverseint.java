package guvi;
import java.util.Scanner;
public class reverseint {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits:");
        String digit=sc.nextLine();
        StringBuffer sb=new StringBuffer(digit);
        sb.reverse();
        System.out.println(sb);
	}
}

