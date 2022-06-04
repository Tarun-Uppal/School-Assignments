import java.util.*;
public class Salary
{
    int Monthly_Salary, Income_Tax;
    String Name, Address, Phone, Subj_Spec;
    public void main(){
        Salary q10= new Salary();
        q10.accept();
        q10.compute();
        q10.display();
    }

    public void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        Name= sc.next();
        System.out.print("Enter your address: ");
        Address= sc.next();
        System.out.print("Enter your phone no: ");
        Phone= sc.next();
        System.out.print("Enter your subject specialisation: ");
        Subj_Spec= sc.next();
        System.out.print("Enter your monthly salary: ");
        Monthly_Salary= sc.nextInt();
    }
    public void compute(){
        int Annual_Salary= Monthly_Salary*12;
        if (Annual_Salary > 175000){
            int x= Annual_Salary - 175000;
            Income_Tax= x/20;
        } else {
            Income_Tax = 0;
        }
    }
    public void display(){
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone No.: " + Phone);
        System.out.println("Subject Specialisation: " + Subj_Spec);
        System.out.println("Monthly Salary: Rs. " + Monthly_Salary);
        System.out.println("Annual Income Tax: Rs. " + Income_Tax);
    }
}
