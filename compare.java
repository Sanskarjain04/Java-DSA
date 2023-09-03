import java.util.Scanner;

public class compare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }
        else if(a<b){
            System.out.println("a is Lesser");
        }
        else{
            System.out.println("a is Greater");
        }
    }
}
