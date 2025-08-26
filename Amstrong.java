import java.util.*;
public class Amstrong{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=n;
        int count=0;
        while(k!=0){
            count++;
            k=k/10;
        }
        int sum=0;
        k=n;
        while(k!=0){
            int rem=k%10;
            sum = sum + power(rem,count);
            n=n/10;
        }
        if(sum==n){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not Amstrong number");
        }
    }
    public static int power(int base,int expo){
        int result=1;
        for(int i=1;i<=expo;i++){
            result*=base;
        }
        return result;
    }
}
