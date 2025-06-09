import java.util.Scanner;

public class LCM {

	//brute force
	//TC:O(a*b-max(a,b))
	static int findLcm(int a,int b) {
		int res=Math.max(a, b);
		//we did max of a,b becoz then only it will divide both nos and will get remainder i.e common multiple in both
		//if nos are 2 and 5 then 3 and 4 can't mulitple of both hence will take max no 5 in res now no>=5 which is common multiple[perfectly divide]both will be LCN
		while(true) {
			if(res%a==0 && res%b==0) {
				break;
			}
			res++;
		}
        return res;
	}

    //optimized approach->we can use euclidean algo which is used to find gcd
	  //optimized euclidean approach -recursive

	     //optimized euclidean approach -iterative
				//     public static int gcd3(int a,int b){
				// while (a>0 && b>0) {
				//     if (a>b) {
				//         a=a%b;
				//     }else{
				//         b=b%a;
				//     }
				// }
				// if (a==0) {
				//     return b;
				// }
				// return a;
				//}

    //assuming b is smaller
    public static int gcdRec(int a,int b){
		if(b==0)return a;
        return gcdRec(b, a%b);
    }
	
	//a*b->constant TC and euclids optimized TC:O(log(min(a,b)))
	//hence TC of findLcmOptimized :TC:O(log(min(a,b)))
	static int findLcmOptimized(int a,int b){
		return (a*b)/gcdRec(a, b);
	}
    

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(findLcm(a, b));
		System.out.println(findLcmOptimized(a, b));
	}

}
