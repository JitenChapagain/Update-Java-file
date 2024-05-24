public class Replace
{
    public static void main(String[] args)
    {
        String a = "apple";
        int b = a.length();
        char c[]= new char[5];
        c=a.toCharArray();

        for(int i=0; i<b; i++)
        {
            if(c[i]=='p')
            {
                c[i]='r';
            }
        }
        System.out.println("Modified string:"+ new String(c));
    }

}
