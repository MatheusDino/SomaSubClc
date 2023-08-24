import java.util.Scanner;

public class CalcClc
{
	public static void main(String[] args) {
	    
	    Scanner scany = new Scanner(System.in);
	    System.out.println("[Soma] ou [Sub]?");
		String operacao = " ";

		while(!(operacao.toLowerCase().equals("soma")) && !(operacao.toLowerCase().equals("sub"))){
	    	operacao = scany.nextLine().toLowerCase();
		}
		
		
		
		System.out.println("Operacao selecionada --> " + operacao);
	    System.out.println("Primeiro numero?");
	    double num1 = scany.nextDouble();
		
	    System.out.println("Segundo numero?");
	    double num2 = scany.nextDouble();
	    if("soma".equals(operacao)){
	        System.out.println("Essa operacao resulta: " + (num1 + num2));
	    }
	    if("sub".equals(operacao)){
	        System.out.println("Essa operacao resulta: " + (num1 - num2));
	    }
		scany.close();
	}
}