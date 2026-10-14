import java.io.IOException;
import java.util.Scanner;

public class ConstruindoCasas {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    while (true){
        int A = sc.nextInt();
        if (A == 0){
            break;
        }
    
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    double ac = A * B;
    double lado = Math.sqrt((ac * 100.0) / C);
    System.out.println((int) lado);
    }
    sc.close();
    }
 
}
