import java.util.Scanner;
public class LeapYrPgrm{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int yr = in.nextInt();
		
		if(yr%4==0 && (yr%100!=0 || yr%400==0)){
			System.out.println("It is a leap year.");
		}
		else{
			System.out.println("Not leap year.");
		}
		in.close();
	}
}
