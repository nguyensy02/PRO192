package Exception;
import java.util.Scanner;

/**
 *
 * @author SyNguyen
 */
public class checkInput {
    public static int inputInteger() {
        Scanner in = new Scanner(System.in);
        boolean cont  = true;
        int n = 0;
        do {
            try {
                System.out.print("Enter the whole number: ");
                n = Integer.parseInt(in.nextLine());
                cont = false;
            } catch (Exception e) {
                System.out.println("Required integer ");
            }
        } while (cont == true || n<0 );
        return n;
    } 
    public static void main(String[] args) {
        int n = inputInteger();
        System.out.println("number "+ n);
    }
}
