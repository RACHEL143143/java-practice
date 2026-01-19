import java.util.Scanner;

public class Asum2 {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int arr[]=new int[n];
    int res[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=n-1;i>0;i--){
        sum=0;
         for(int j=i-1;j<n;j++){
            sum+=arr[j];
         }
         res[i]=sum;
         
    }
    for(int i=0;i<n;i++){
        System.out.println(res[i]);
    }
        

}
}