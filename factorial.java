package guvi;
import java.util.Scanner;
public class factorial {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Eneter integer:");
			int  num=sc.nextInt();
			int result=1;
			for(int i=num;i>0;i--){
				result=i*result;
			}
			System.out.println(result);
		}
}
