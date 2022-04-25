public class NaturalSum {
    public static int NaturalSum_Method(int n)
    {
        if (n==0)
        {
            return n;
        }
        else
        {
            return n+NaturalSum_Method(n-1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println("The Natural Sum is: "+NaturalSum_Method(10));
    }
}
