public class SumOfDigits {
    public static int Method(int n)
    {
        if(n==0) return n;
        else
        {
            return n%10+Method(n/10);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Method(1234));
    }
}
