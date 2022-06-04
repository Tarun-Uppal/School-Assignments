public class Q12
{
    public static void main(){
        for (int i = 100;i<200;i++){
            int temp = i;
            boolean val = false;
            for(int j = 0; temp>0;j++){
                if ((temp%10) == 0){
                    val = true;
                }
                temp/=10;
            }
            if (!val){
                System.out.print(i+", ");
            }
        }
    }
}
