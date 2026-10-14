import java.io.IOException;
import java.util.Scanner;
public class idadeemDias {

    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    
    int year = age / 365;
    int rest = age % 365;
    int month = rest / 30;
    int days = rest % 30; 
    System.out.println(year + " ano(s)");
    System.out.println(month + " mes(es)");
    System.out.println(days + " dia(s)"); 
    }
 
}
