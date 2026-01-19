import java.util.Scanner;

public class Freq {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[10];
    while(n>0){
        int a=n%10;
        arr[a]++;
        n/=10;
    }
    for(int i=0;i<10;i++){
      if(arr[i]>0){
        System.out.println("digit:"+i+"occurs:"+arr[i]);
      }
    }
    }
}
