import java.io.IOException;
import java.util.Scanner;
public class Salario {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num;
        int tim;
        double vph;
        double sal;
        
        num = sc.nextInt();
        tim= sc.nextInt();
        vph= sc.nextDouble();
        
        sal =  (double) tim * vph; 
        
        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", sal);
        
        sc.close();

    }
 
}
