import java.util.Scanner;

public class Prime {
    
    //naive method
    //TC:o(n)
    static boolean isPrime(int n){
        if (n==1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    //efficient method1
    //TC:o(√n)
    static boolean isPrime2(int n){
        if (n==1) {
            return false;//becoz 1 is neither prime nor composite
        }
        for (int i = 2; i*i <= n; i++) {
            //i*i <= n means i<=√n
            if (n % i==0) {
                return false;
            }
        }
        return true;
    }

    //more efficient method for large n
    static boolean isPrime3(int n){
            if(n==1)return false;
            if(n==2 || n==3) return true;
            if (n % 2==0 || n%3==0) return false;
            for(int i=5;i*i<=n;i=i+6){
                    if (n % i==0 || n%(i+2)==0) {
                        return false;
                    }
            }
            return true;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(isPrime(n));
       System.out.println(isPrime2(n));
       System.out.println(isPrime3(n));
    }
}
