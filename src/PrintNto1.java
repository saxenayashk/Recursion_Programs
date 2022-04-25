public class PrintNto1 {
    public static void Method(int n)
    {
        if (n==0)  return;
        System.out.print(n+" ");
        Method(n-1);
    }
    public static void main(String[] args)
    {
        Method(10);
    }
}
