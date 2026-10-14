import java.io.IOException;
import java.util.Scanner;
public class Tabuada {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    
    for(int i = 1; i <= 10 ; i++){
        int soma = i * x;
        System.out.println(i + " x " + x + " = " + soma);
    }
    }
 
}
