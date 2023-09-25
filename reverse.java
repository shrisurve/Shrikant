import java.lang.*;
class reverse{
   public static void main(String args[])
      {
         int num=452,rem,reverse=0; 
           
           while(num!=0)
                {
                   rem=num%10;
                   reverse=reverse*num+rem;
                   num=num/10;
                 }
           System.out.println("The reverse number is:"+reverse);

      }
}