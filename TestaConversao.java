
public class TestaConversao {
	
	public static void main(String[] args) {

		// Nao é possivel esse tipo de conversao em Java
		// double salario = 1270.50;
		//int valor = salario;
		
		float pontoFlutuante = 3.14f;    // Casting colocando f no final do numero. 
		
		// Fazendo Casting
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
	}

}
