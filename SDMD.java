import java.util.Scanner;
public class SDMD{
    public static void main(String args[]){
    int intNum1, intNum2;
    Scanner inp = new Scanner(System.in);
    System.out.println("Please input two numbers:");

    intNum1 = inp.nextInt();
    intNum2 = inp.nextInt();

    System.out.println("The sum is " + (intNum1 + intNum2) + "\n");
    System.out.println("The difference is " + (intNum1 - intNum2) + "\n");
    System.out.println("The multiplication is " + (intNum1 * intNum2) + "\n");
    System.out.println("The division is " + ((float)intNum1 / intNum2) + "\n");
    
}
}
