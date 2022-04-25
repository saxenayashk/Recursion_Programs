public class RopeCuttingProb {

    public static int Method(int n,int a,int b,int c)
    {
        if(n==0) return 0;
        if(n<=-1) return -1;

        int res=Math.max(Method(n-a,a,b,c),Math.max(Method(n-b,a,b,c),Method(n-c,a,b,c)));

        if(res==-1) return -1;

        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(Method(5,2,1,5));
    }
}
