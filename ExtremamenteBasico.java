import java.io.IOException;
import java.util.Scanner;
public class ExtremamenteBasico {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int X;
        a = sc.nextInt();
        b = sc.nextInt();
        X = a + b;
        System.out.println("X = " + X);
        sc.close();
        
    }
 
}
