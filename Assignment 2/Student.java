import java.util.*;
public class Student
{
    String name;
    int m1, m2, m3, max_Marks, average, age;
    void main(){
        Student q11 = new Student();
        q11.accept();
        q11.compute();
        q11.display();
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the name :");
        name = sc.next();
        System.out.print("Please enter the age :");
        age = sc.nextInt();
        System.out.print("Please enter the m1:");
        m1 = sc.nextInt();
        System.out.print("Please enter the m2:");
        m2 = sc.nextInt();
        System.out.print("Please enter the m3:");
        m3 = sc.nextInt();
    }
    void compute(){
        average = ((m1+m2+m3)/3);
        max_Marks = Math.max(Math.max(m1, m2), m3);
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("m1: "+ m1);
        System.out.println("m2: "+ m2);
        System.out.println("m3: "+ m3);
        System.out.println("average: "+ average);
        System.out.println("max marks: "+ max_Marks);
    }
}
