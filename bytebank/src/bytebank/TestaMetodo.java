package bytebank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
			
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiSacar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		System.out.println(conseguiSacar);
		
		Conta contaDaMarcela = new Conta();
		
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.tranfere(300, contaDoPaulo);
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
