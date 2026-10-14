import java.io.IOException;
import java.util.Scanner; 
public class QuadradodePares {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i = 1; i <= x; i++){
        if(i % 2 == 0){
            long square = (long) i * i;
            System.out.println(i + "^2 = " + square);
        }
    }
    
    }
 
}
