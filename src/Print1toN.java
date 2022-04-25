public class Print1toN {

    public static void Method(int n)
    {
        if(n==0) return;
        Method(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args)
    {
        Method(10);
    }
}
