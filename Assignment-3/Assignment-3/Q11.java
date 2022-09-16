import java.util.*;
public class Q11
{
    Scanner sc = new Scanner(System.in);
    Marks data;
    public static void main(){
        Q11 q11 = new Q11();
        q11.accept();
        q11.calculate();
        q11.print();
    }

    void accept(){
            System.out.print("Name ");
            String name = sc.next();
            System.out.print("age ");
            int age = sc.nextInt();
            System.out.print("eng ");
            int eng = sc.nextInt();
            System.out.print("math ");
            int math = sc.nextInt();
            System.out.print("sci ");
            int sci = sc.nextInt();
            data = new Marks(name, eng, math, sci);
            data.age = age;
    }
    
    void calculate(){
            data.average = ((data.math + data.eng + data.sci)/3);
    }

    void print(){
            System.out.println("Name " + data.name);
            System.out.println("Age " + data.age);
            System.out.println("Eng " + data.eng);
            System.out.println("Math " + data.math);
            System.out.println("Sci " + data.sci);
            System.out.println("Average " + data.average);
            System.out.println();
    }
    public class Marks{
        String name;
        int age;
        int eng;
        int math;
        int sci;
        double average;
        Marks(String n, int E, int M, int S){
            name = n;
            eng = E;
            math = M;
            sci = S;
        }
    }
}