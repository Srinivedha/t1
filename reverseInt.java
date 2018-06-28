import java.io.*;
import java.util.*;
class reverseInt
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>10)
        {
            int b=0,b1=0;
        while(a>0)
        {
             b1=a%10;
             b=b*10+b1;
             a=a/10;
        }
        System.out.print(b);
        }
        else
        {
            System.out.print(a);
        }
    }
}
