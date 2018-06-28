import java.io.*;
import java.util.*;
class fact1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if((a==0)||(a==1))
        {
            System.out.print("1");
        }
        else
        {
        int mul=1;
        for(int i=1;i<=a;i++)
        {
            mul=mul*i;
        }
        System.out.print(mul);
        }
    }
}
