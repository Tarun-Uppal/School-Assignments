import java.util.*;
public class Q13
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum=0,rem;
      while(sum!=1 && sum!=4)
      {
     sum=0;
     while(num!=0)
     {
         rem=num%10;
         sum+=(rem*rem);
         num/=10;
     }
     num=sum;
     }
    if(sum==1)
       System.out.println(temp + " is a Happy Number");
     else
          System.out.println(temp + " is not a Happy Number");
       
    }    
}
