import java.util.*;
public class Q12
{
    MovieMagic mm;
    public void main(){
        Q12 q12 = new Q12();
        q12.accept();
        q12.display();
    }

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Title: ");
        String t = sc.next();
        System.out.print("Year: ");
        int y = sc.nextInt();
        float r[] = new float[2];
        System.out.print("Rating min: ");
        r[0] = sc.nextFloat();
        System.out.print("Rating max: ");
        r[1] = sc.nextFloat();
        mm = new MovieMagic(t, y, r);
    }

    public void display(){
        float min = mm.rating[0];
        float max = mm.rating[1]; 
        if ((min >= 0 && min <= 2) && (max>= 0 && max<= 2)){
            System.out.println("Flop");
        } if ((min >= 2.1 && min <= 3.4) && (max>= 2.1 && max<= 3.4)){
            System.out.println("Semi-Hit");
        } if ((min >= 3.5 && min <= 4.5) && (max>= 3.5 && max<= 4.5)){
            System.out.println("Hit");
        } if ((min >= 4.6 && min <= 5) && (max>= 4.6 && max<= 5)){
            System.out.println("Super Hit");
        }
    }
    public class MovieMagic{
        String title;
        int year;
        float rating[] = new float[2];
        MovieMagic(String t, int y, float r[]){
            title = t;
            year = y;
            rating = r;
        }
    }
}

