import java.util.Scanner;

public class Lvowcons {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String text=sc.nextLine();
    for(int i=0;i<text.length();i++){
        int ch=text.charAt(i);
        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'){
            System.out.println("vowels:"+(char)ch+" ");
        }
    
    }
    System.out.print("consonents:");
        for(int i=0;i<text.length();i++){
        int ch=text.charAt(i);
        if(ch>='a' && ch<='z'&&!(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')){
            
            System.out.println((char)ch+" ");
        }
        
    }
}

}
