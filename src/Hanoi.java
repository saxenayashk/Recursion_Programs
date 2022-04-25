public class Hanoi {

    public static void Method(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println("Move 1 From "+A+" to "+C);
            return;
        }
        Method(n-1,A,B,C);
        System.out.println("Move "+n+" from "+A+" to "+C);
        Method(n-1,B,A,C);
    }

    public static void main(String[] args)
    {
       Method(7,'A','B','C');
    }
}
