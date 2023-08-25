import java.util.Scanner;

public class CalcClc
{
	public static void main(String[] args) {
	    
	    Scanner scany = new Scanner(System.in);
	    System.out.println("Deseja somar ou Subtrair?");
		String operacao = " ";

		while(!(operacao.toLowerCase().equals("soma")) && !(operacao.toLowerCase().equals("sub")) && !(operacao.toLowerCase().equals("par ou impar"))){
			System.out.println("Lembre-se de digitar somente [Soma] ou [Sub] ou [par ou impar].");
	    	operacao = scany.nextLine().toLowerCase();
		}
		
		
		double num1 = 0;
		double num2 = 0;
		
		boolean checador = false;
		String entrada = "";
		System.out.println("Operacao selecionada --> " + operacao);
		
		System.out.println("Primeiro numero?");
		while(checador == false){
			entrada = scany.nextLine();
			try{
				num1 = Double.parseDouble(entrada);
				checador = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Por favor, digite um numero!");
			}
		}

		checador = false;
		entrada = "";
		System.out.println("Segundo numero?");
		while(checador == false){
			entrada = scany.nextLine();
			try{
				num2 = Double.parseDouble(entrada);
				checador = true;
			}
			catch(NumberFormatException e) {
				System.out.println("Por favor, digite um numero!");
			}
		}
	    
	    if("soma".equals(operacao)){
	        System.out.println("Essa operacao resulta: " + (num1 + num2));
	    }
	    if("sub".equals(operacao)){
	        System.out.println("Essa operacao resulta: " + (num1 - num2));
	    }
		if("par ou impar".equals(operacao)){
			if(num1 % num2 == 1){
				System.out.println("Esse numero eh impar");
			} else {
				System.out.println("Esse numero eh par");
			}
		}
		scany.close();
	}
}