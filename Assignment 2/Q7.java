import java.util.*;
public class Q7
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1-volume of cube\n2-volume of sphere\n"+
        "3-volume of cuboid\nPlease enter your choice: ");
        int c = sc.nextInt();
        int vol =0;
        Q7 q7 = new Q7();
        switch(c){
            case 1:
            System.out.print("Side of cube:");
            int s = sc.nextInt();
            vol = calc(s);
            break;
            case 2:
            System.out.print("Radius of sphere:");
            double r = sc.nextDouble();
            vol = calc((22/7),r);
            break;
            case 3:
            System.out.print("Length of cuboid:");
            int l = sc.nextInt();
            System.out.print("Breadth of cuboid:");
            int b = sc.nextInt();
            System.out.print("Height of cuboid:");
            int h = sc.nextInt();
            vol = calc(l, b, h);
            break;
        }
        System.out.println(vol);
    }
    int calc(int s){
        return s*s*s;
    }
    int calc(int pi, double r){
        return (int)((4/3)*(pi)*r*r*r);
    }
    int calc(int l, int b, int h){
        return h*l*b;
    }
}

