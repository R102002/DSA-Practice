public class GCDTwoNumbers {

    //naive approach
    // a=10 b=15;  gcd will not be greater than 10 becoz then it will not divide 10 
    //hence we take min of a and b limit of gcd can be from[1,10]
    //hence will start from 10[min no] and will modulo and see both nos if !=0 will do res-- becoz that res didn't divide both of them 
    //and we do -- becoz res can't be >10[i.e min(a,b)]

    //`TC:O(min(a,b))`
    public static int gcd1(int a,int b){
            int res=Math.min(a, b);
            while (res>0) {
                if (a%res==0 && b%res==0) {
                    break;
                }
                res--;
            }
            return res;
    }

    //euclidean approach 1
    //if a>b ->a-b,b and if a<b -> a,b-a

    public static int gcd2(int a,int b){
        while (a!=b) { //if a==b return any one of them
            if (a>b) {
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    //optimized euclidean approach -iterative
    public static int gcd3(int a,int b){
while (a>0 && b>0) {
    if (a>b) {
        a=a%b;
    }else{
        b=b%a;
    }
}
if (a==0) {
    return b;
}
return a;
    }
    //optimized euclidean approach -recursive
    //assuming b is smaller
    public static int gcdRec(int a,int b){
        if(b==0)return a;
        return gcdRec(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd1(10, 15));//5
        System.out.println(gcd1(28, 20));//4
        System.out.println(gcd2(28, 20));//4
        System.out.println(gcd3(28, 20));//4
        System.out.println(gcdRec(28, 20));//4
        System.out.println(gcdRec(10, 15));//5
    }
}
