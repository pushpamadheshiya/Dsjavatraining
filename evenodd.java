import java.util.Scanner;

//Ternary operator to find the even number or odd number
public class evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        String output =(a%2==0)? "Even number":" Odd number ";
         System.out.println(output);
    }

}
