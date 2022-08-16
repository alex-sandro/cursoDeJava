
public class TesteIR {
	public static void main(String[] args) {
		
		double salario = 3300.0;
		double IR = 0;
		double deduzirDeclaracao = 0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			IR = 7.5;
			deduzirDeclaracao = 142.0;
		}else if (salario >= 2800.01 && salario <= 3751.0) {
			IR = 15;
			deduzirDeclaracao = 350;
		}else if (salario >= 3751.01 && salario <= 4664.0) {
			IR = 22.5;
			deduzirDeclaracao = 636;
		}
		System.out.println("A sua aliquota eh de " + IR + "%.");
		System.out.println("Voce vai deduzir " + deduzirDeclaracao + " do imposto de renda." );
	}
}
