package exerciciosLista1;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o raio do círculo: ");
	        double raio = scanner.nextDouble();
	        double perimetro = 2 * Math.PI * raio;
	        System.out.println("O perímetro do círculo é: " + perimetro);
	        scanner.close();

	}

}
