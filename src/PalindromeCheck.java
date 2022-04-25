public class PalindromeCheck {

    public static boolean Method(char ch[],int low,int high)
    {
        if(low>=high)
        {
            return true;
        }
        else
        {
            return (ch[low]==ch[high] && Method(ch,low+1,high-1));
        }
    }

    public static void main(String[] args)
    {
        String str="namvn";
        char ch[]=str.toCharArray();
        System.out.println(Method(ch,0,ch.length-1));
    }
}
