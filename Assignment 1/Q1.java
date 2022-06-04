import java.util.*;
public class Q1
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the distance: ");
        int d = sc.nextInt();
        int s = 0;
        
        if (d>70){
            s += (d-70)*12;
            s += (30*10) + (20*20) + (40*15);
        } else if (d<=70 && d>40){
            s+= (d-40)*15;
            s += (30*10) + (20*20);
        }else if (d>10 && d<30){
            s+= (d-10)*20;
            s += (30*10);
        } else {
            s += (30*d);
        }
        
        System.out.println(s);
    }
}
