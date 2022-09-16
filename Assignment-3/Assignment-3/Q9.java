import java.util.*;
public class Q9
{
    Scanner sc = new Scanner(System.in);
    int roll_no[] = new int[10];
    String name[] = new String[10];
    int maths[] = new int[10];
    int english[] = new int[10];
    int total[] = new int[10];
    public static void main(){
        Q9 q9 = new Q9();
        q9.accept();
        q9.calculate();
        q9.print();
    }

    void accept(){
        for(int i  =0; i < 10; i++){
            System.out.print("Roll no ");
            roll_no[i] = sc.nextInt();
            System.out.print("Name ");
            name[i] = sc.next();
            System.out.print("Maths ");
            maths[i] = sc.nextInt();
            System.out.print("English ");
            english[i] = sc.nextInt();
        }
    }
    
    void calculate(){
        for(int i = 0; i < 10;i++){
            total[i] = maths[i] + english[i];
        }
    }

    void print(){
        System.out.println("Roll num Name\tMaths\tEnglish\tTotal");
        for(int i  = 0; i < 10; i++){
            System.out.println(roll_no[i] + "\t" + name[i] + "\t" + maths[i] + "\t" + english[i] + "\t" + total[i]);
        }
    }
}