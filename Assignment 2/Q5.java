public class Q5
{
    public void main(){
        Q5 q5 = new Q5();
        for (int i = 1;i<500;i++){
            if(q5.isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }
    boolean isPrime(int n){
        for (int i = 2;n>i;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
