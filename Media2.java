import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();
    
    double media = ((A*2.0)+(B*3.0)+(C*5.0))/10.0;
    System.out.printf("MEDIA = %.1f%n" , media);
    sc.close();
    }
 
}
