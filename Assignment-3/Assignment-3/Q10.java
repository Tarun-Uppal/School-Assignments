import java.util.*;
public class Q10
{
    Scanner sc = new Scanner(System.in);
    Employee data;
    public static void main(){
        Q10 q10 = new Q10();
        q10.accept();
        q10.calculate();
        q10.print();
    }

    void accept(){
            System.out.print("Name ");
            String name = sc.next();
            System.out.print("emp no ");
            String emp_no = sc.next();
            System.out.print("basic ");
            int basic = sc.nextInt();
            data = new Employee(name, emp_no, basic);
    }
    
    void calculate(){
            int sal = data.salary;
            int da = (30*sal)/100;
            int hra = (15*sal)/100;
            int pf = (12*sal)/100;
            data.gross = (sal + da + hra);
            data.net = (data.gross - pf);
    }

    void print(){
            System.out.println("Name " + data.name);
            System.out.println("Employee No." + data.employee_no);
            System.out.println("Gross " + data.gross);
            System.out.println("Net " + data.net);
    }
    public class Employee{
        String name;
        String employee_no;
        int salary;
        int gross = 0;
        int net = 0;
        Employee(String n, String en, int sal){
            name = n;
            employee_no = en;
            salary = sal;
        }
    }
}