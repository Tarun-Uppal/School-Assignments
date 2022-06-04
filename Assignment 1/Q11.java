public class Q11
{
    public void main(){
        for(int j = 10; j<=1000;j++){
            int n = j,r = 0, len = 0, temp = n;
            for (int i = 1; temp>0;i++){
                temp/=10;
                len++;
            }
            temp = n;
            for (int i = 1; len>=i;i++){
                r+= Math.pow(10, (len-i))*(temp%10);
                temp/=10;
            }
            n = j;
            int hcf = 1;
            for(int i = 2;i<n;i++){
                if (n%i == 0){
                    hcf= i;
                }
            }
            if (n == r && hcf == 1){
                System.out.print(j+", ");
            }
        }
    }
}
