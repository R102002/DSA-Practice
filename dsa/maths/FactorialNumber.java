import java.util.Scanner;

public class FactorialNumber {
    //iterative approach-better  
    public static int fact(int n){
        int res=1;
        for (int i = 2; i <=n; i++) {
            // <=n becoz we multiply all nos till n in factorial
            res=res*i;
        }
        return res;
    }

    //recursive approach
    public static int fact2(int n){
        //base condition
        if (n==0) {
            return 1;
        }
        return n*fact2(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("iterative : "+fact(n));
        System.out.println("recursive : "+fact2(n));
    }
}
