package exerciciosLista1;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		 
		        
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Digite o primeiro número inteiro: ");
		        int numero1 = scanner.nextInt();

		        System.out.print("Digite o segundo número inteiro: ");
		        int numero2 = scanner.nextInt();

		        System.out.print("Digite o terceiro número inteiro: ");
		        int numero3 = scanner.nextInt();
		        double media = (numero1 + numero2 + numero3) / 3.0;

		        System.out.println("A média aritmética é: " + media);
		        scanner.close();
		    }

	}


