import java.io.IOException;
import java.util.Scanner;
 

public class UmDoisTres {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++ ){
            String w = sc.next();
            
            if(w.length() == 5){
                System.out.println(3);
            } else{
                int ig = 0;
                
                if (w.charAt(0) == 'o') ig++;
                if (w.charAt(1) == 'n') ig++;
                if (w.charAt(2) == 'e') ig++;

                 if (ig >= 2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
                
            }
        }
 
    }
 
}
