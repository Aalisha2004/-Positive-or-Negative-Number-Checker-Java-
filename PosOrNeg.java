import java.util.*;

public class PosOrNeg{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check positive or not");
        float num=sc.nextFloat();
        if(num>=0)
        {
            System.out.println("Positive");
        }
        else{
            System.out.println("Not positive");
        }
    }
}