import java.util.*;
public class Q8
{
    public void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your choice 1, 2 or 3: ");
        int c = sc.nextInt();
        int res = 0;
        Q8 q8 = new Q8();
        char ch;
        switch(c){
            case 1:
                System.out.print("num:");
                int num = sc.nextInt();
                System.out.print("ch:");
                ch = sc.next().charAt(0);
                res = q8.num_calc(num, ch);
                break;
            case 2:
                System.out.print("a:");
                int a = sc.nextInt();
                System.out.print("b:");
                int b = sc.nextInt();
                System.out.print("ch:");
                ch = sc.next().charAt(0);
                res = q8.num_calc(a, b, ch);
                break;
            case 3:
                System.out.print("s1:");
                String s1 = sc.next();
                System.out.print("s2:");
                String s2 = sc.next();
                q8.num_calc(s1, s2);
                break;
        }
        if (res != 0){
            System.out.println(res);
        }
    }
    int num_calc(int num, char ch){
        if(ch =='s'){
            return num*num;
        }
        return num*num*num;
    }
    int num_calc(int a, int b, char ch){
        if (ch=='p'){
            return a-b;
        }
        return a+b;
    }
    void num_calc(String s1, String s2){
        if(s1==s2){
            System.out.println(s1 + " and "+ s2 + " are equal.");
        }
        else{
            System.out.println(s1 + " and "+ s2 + " are not equal.");
        }
    }
}

