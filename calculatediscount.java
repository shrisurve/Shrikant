import java.lang.*;
import java.util.*;
class calculatediscount
{
    static double sum(double...p)
    {
        double sum=0;
        for(int i=1;i<=p.length;i++)
        {
            sum+=p[i];
        }
        if(sum<500) return sum*0.10;
        else if(sum>=500 && sum<1000)return sum*0.15;
        else return sum*0.20;
    }
    public static void main(String[]args)
    {
       
        
        System.out.println("Sum is: "+sum(10.72,20.31,30.44));
    }
}