
public class ProgramaComBreak {
	public static void main(String args[]) {
        for(int linha = 0; linha < 6; linha++) {
            for (int coluna = 1; coluna <= 5; coluna++) {
                if ( linha < coluna ) {
                	coluna++;
                	break;
                }                
                System.out.print( coluna );
            }
            System.out.println();
        }
    }
}
