import java.io.IOException;
import java.util.Scanner;
public class SubstituicaoemVetorI {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[10];
        for(int i = 0; i <= 9; i++){
             vet[i] = sc.nextInt();
            if(vet[i] <= 0){
                System.out.println("X["+i+"] = 1");
            }else{
                System.out.println("X["+i+"] = "+vet[i]);
            }
        }
    }
 
}
