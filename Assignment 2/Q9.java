import java.util.*;
public class Q9
{
    public void main(){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the function you want?");
       System.out.println("1. int,char\n2. double,char\n3. int,int,char");
       int choice= sc.nextInt();
       char c; 
       Q9 q9 = new Q9();
       int a;
       switch(choice){
       case 1:
              System.out.print("Enter the int value: ");
              a=sc.nextInt();
              System.out.print("Enter the char value: ");
              c =sc.next().charAt(0);
              q9.compute(a,c);
              break;
       case 2:
              System.out.print("Enter the double value: ");
              double z=sc.nextDouble();
              System.out.print("Enter the char value: ");
              c=sc.next().charAt(0);
              q9.compute(z,c);
              break;       
       case 3:
              System.out.print("Enter the first int value: ");
              a=sc.nextInt();
              System.out.print("Enter the second int value: ");
              int b=sc.nextInt();
              System.out.print("Enter the char value: ");
              c=sc.next().charAt(0);
              q9.compute(a,b,c);
              break;
      }
    }
    void compute (int x, char ch){
        if(ch=='s')
            x *= x;
        else
            x = x*x*x;
        System.out.println(x);
    }
    void compute (double d, char ch){
        if(ch=='v')
            d = d*d*d;
        else
            d = (Math.sqrt(3))*d;
        System.out.println(d);
    }
    void compute (int x, int y, char ch){
        if(ch=='a')
            x*= y;
        else
            x=(2*(x+y));
        System.out.println(x);        
    }
}
