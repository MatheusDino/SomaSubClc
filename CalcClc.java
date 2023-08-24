import java.util.Scanner;

public class CalcClc
{
	public static void main(String[] args) {
	    
	    Scanner scany = new Scanner(System.in);
	    System.out.println("[Soma] ou [Sub]?");
	    String operacao = scany.nextLine();
	    System.out.println("Primeiro número?");
	    double num1 = scany.nextDouble();
	    System.out.println("Segundo número?");
	    double num2 = scany.nextDouble();
	    if("Soma".equals(operacao)){
	        System.out.println("Essa operação dá: " + (num1 + num2));
	    }
	    if("Sub".equals(operacao)){
	        System.out.println("Essa operação dá: " + (num1 - num2));
	    }
		scany.close();
	}
}