import java.util.*;

public class loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        for(int counter=0;counter<100;counter++){
             System.out.println("Hello World");
         }
        // for(int count=0;count<11;count++){
        //     System.out.println(count+" ");
        // }
        int i=12;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }
        do{
            System.out.println("Programming");
        }while(i<11);
        //Sum of n natural numbers:
        int n=sc.nextInt();
        int sum=0;
        for(int j=0;j<=n;j++){
            sum=sum+j;
        }
        System.out.println(sum);
    }
}
