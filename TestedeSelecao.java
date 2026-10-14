import java.io.IOException;
import java.util.Scanner;

public class TestedeSelecao {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt(); 
        
        int somaAB=A+B;
        int somaCD=C+D;
        
        if(B > C && D > A && somaCD > somaAB && somaAB > 0 && somaCD > 0 && A %2 == 0 ){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}
