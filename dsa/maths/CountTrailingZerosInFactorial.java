import java.util.Scanner;

public class CountTrailingZerosInFactorial {
    //naive method
    //20! = 2,432,902,008,176,640,000 → already overflows int
    //20! overflows int ,When n is large (say 20, 50, 100), the value of n! becomes too big to store in an int or even a long.
    //hence we shifted to efficient method
   public static int countZero(int n){
        int fact=1;
        for (int i = 2; i <=n; i++) {
            fact=fact*i;
        }
        int res=0;
        while (fact %10 ==0) {
            res++;
            fact=fact/10;
        }
        return res;
    }

    //efficient approach
    public static int countZeroEfficiently(int n){
        int res=0;
        for (int i = 5; i <=n; i=i*5) {
            res=res+n/i;
        }
        return res;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("naive approach : "+countZero(n));//if i provide n as 100 here it won't work becoz overflows int ,When n is large (say 20, 50, 100)
    /*
      n=10
      naive approach : 2
     */
    int n2=sc.nextInt();
System.out.println("efficient approach : "+countZeroEfficiently(n2));
    /*
      n=100
      efficient approach : 24
     */ 
}
    
}