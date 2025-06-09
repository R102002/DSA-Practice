import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPali(int n){
        int rev=0;
        int temp=n;
        // is !=0 not temp > 0 like countDigits
        while (temp!=0) {
            int ld=temp%10;//ld->last digit
            rev=rev*10+ld;
            temp/=10;
        }
        return(rev==n);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPali(n));
    }
}

