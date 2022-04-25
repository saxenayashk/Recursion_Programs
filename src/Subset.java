public class Subset {

    public static void Method(String str,String curr,int index)
    {
        if (index==str.length())
        {
            System.out.print(curr+" ");
            return;
        }
        Method(str,curr,index+1);
        Method(str,curr+str.charAt(index),index+1);
    }

    public static void main(String[] args)
    {
       String str="YASH";
       String curr="";
       int index=0;

       Method(str,curr,index);
    }
}
