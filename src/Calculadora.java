import java.util.Scanner;

public class Calculadora {
	

	public static void main(String[] args) {
		double valorA=0, valorB=0;
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;		
		while (opcao!=6) {
			Funcoes.mostrarMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1º valor:");
				valorA = leitor.nextDouble();
				System.out.println("\n\nDigite o 2º valor:");
				valorB = leitor.nextDouble();	
				System.out.println("Os valores " + valorA + " e " + valorB + " foram armazenados\n\n");
				break;
			case 2:
				Funcoes.somar(valorA, valorB);	
				break;
			case 3:
				Funcoes.subtrair(valorA, valorB);
				break;
			case 4:
				Funcoes.multiplicar(valorA, valorB);
				break;
			case 5:
				Funcoes.dividir(valorA, valorB);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
