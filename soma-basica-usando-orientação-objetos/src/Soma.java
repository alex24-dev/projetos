import java.util.Scanner;

public class Soma {
	
	Scanner input = new Scanner(System.in);
	
	private int numero1;
	private int numero2;
	private int resultado;
	
	public Soma (int numero1,int numero2,int resultado){
		
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.resultado = resultado;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int getResultado() {
		return resultado = numero1 + numero2;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
		
		System.out.println("Digite um numero"); 
		numero1 = input.nextInt();
		 
		 System.out.println("Digite outro numero"); 
		 numero2 = input.nextInt();
	}
	
	
}

/*
 * public int somaNumero (int num1 ,int num2) {
 * 
 * System.out.println("Digite um numero"); num1 = input.nextInt();
 * 
 * System.out.println("Digite outro numero"); num2 = input.nextInt();
 * 
 * int num3 = num1 + num2;
 * 
 * System.out.println("O resultado é:" + num3);
 * 
 * return num3; }
 */