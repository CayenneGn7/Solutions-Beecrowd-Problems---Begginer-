import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Media1 {
 
    public static void main(String[] args) throws IOException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double p1 = 3.5;
    double p2 = 7.5;
    double media = ((A * p1) + (B * p2))/11.0;
    System.out.printf("MEDIA = %.5f\n" , media);
    sc.close();
    }
 
}
