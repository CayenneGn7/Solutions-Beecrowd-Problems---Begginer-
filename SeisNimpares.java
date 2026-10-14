import java.io.IOException;
import java.util.Scanner;
 
public class SeisNimpares {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int val = scanner.nextInt();
        
    if(val % 2 == 0){
        val++; 
    }
    for(int i = 0 ; i < 6 ; i++){
        System.out.println(val);
        val += 2;
    }
    }
 
}
