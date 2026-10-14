import java.io.IOException;
import java.util.Scanner;
public class TrocadeVetorI {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int vet[] = new int[20];
        int apoio;
        for(int i = 0; i < vet.length; i++){
             vet[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            apoio = vet[i];
            vet[i]= vet[19 - i];
            vet[19 - i] = apoio;
        }
        for(int i = 0; i < vet.length; i++){
            System.out.println("N["+i+"] = "+vet[i]);
        }
        
 
    }
 
}
