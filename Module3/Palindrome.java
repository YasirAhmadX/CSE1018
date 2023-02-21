import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //given number
        int rn=0,nb=n; //reverse number //nb number buffer
        while (n>0){
            rn = 10*rn + n%10;
            n = n/10;
        }
        System.out.println("rn = "+rn+"\n"+((nb==rn)? "Palindrome":"Not Palindrome"));
    }
}