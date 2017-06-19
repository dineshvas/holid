package guvi;
import java.util.Scanner;
public class workingday {
	public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enetr the day:");
  String day=sc.nextLine();
  if((day=="sunday")||(day=="saturday")){
	  System.out.println("HOLIDAY"+day);
	}
  else{
	  System.out.println("WORKINGDAY:"+day);
  }
	}}
