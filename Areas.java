import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Areas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Double A,B,C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		Double a = A*C/2;
		Double b = 3.14159*(C*C);
		Double c = (A+B)*C/2;
		Double d = B*B;
		Double e = A*B;

		DecimalFormat df = new DecimalFormat("0.000");
		
		System.out.println("TRIANGULO: " + df.format(a));
		System.out.println("CIRCULO: " + df.format(b));
		System.out.println("TRAPEZIO: " + df.format(c));
		System.out.println("QUADRADO: " + df.format(d));
		System.out.println("RETANGULO: " + df.format(e));
	
		sc.close();
	}
}
