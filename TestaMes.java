
public class TestaMes {
	public static void main(String[] args) {
		int mes = 13;
		String frase = "O mes eh"; 
		switch (mes) {
			case 1:
				System.out.println(frase + " Janeiro");
				break;
			case 2:
				System.out.println(frase + " Fevereiro");
				break;
			case 3:
				System.out.println(frase + " Março");
				break;
			case 4:
				System.out.println(frase + " Abril");
				break;
			case 5:
				System.out.println(frase + " Maio");
				break;
			case 6:
				System.out.println(frase + " Junho");
				break;
			case 7:
				System.out.println(frase + " Julho");
				break;
			case 8:
				System.out.println(frase + " Agosto");
				break;
			case 9:
				System.out.println(frase + " Setembro");
				break;
			case 10:
				System.out.println(frase + " Outubro");
				break;
			case 11:
				System.out.println(frase + " Novembro");
				break;
			case 12:
				System.out.println(frase + " Dezembro");
				break;
			default:
				System.out.println("Mes invalido");
				break;
		}
	}
}
