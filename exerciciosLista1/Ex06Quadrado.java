package exerciciosLista1;
import java.util.Scanner;
public class Ex06Quadrado {

	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		       
		        System.out.print("Digite um número inteiro: ");
		        int numero = scanner.nextInt();
		        int quadrado = numero * numero;
		        System.out.println("O quadrado de " + numero + " é " + quadrado + ".");
		        scanner.close();
		    }


	}


