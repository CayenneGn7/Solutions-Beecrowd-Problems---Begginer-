import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class AreadoCirculo {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    Double A = sc.nextDouble();
    Double area = 3.14159*(Math.pow(A , 2));
    System.out.printf("A=%.4f%n", area);
    
    }
 
}
