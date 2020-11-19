package arena;

public class Main {

	public static final char[] NOME_CARRO= {
			  'A'
			, 'B'
			//, 'C'
			//, 'D'
			//, 'E'
			//, 'F'
			//, 'G'
			//, 'H'
			};
	
	//Distância do percurso em quilometros
	public static final int DISTANCIA_DA_CORRIDA = 50; 

	/**
	 * Responsável por executar o programa, criando e chamando o objeto para
	 * que a corrida inicie.
	 * 
	 * @param args
	 * 
	 * void
	 * 
	 * @author angelo_foletto
	 * @version 2.5
	 * @since 2020-11-19
	 */
	public static void main(String[] args) {
		
		final int quantidade_carro = NOME_CARRO.length;
		Carro[] corrida = new Carro[quantidade_carro];
		
		for (int x = 0; x < quantidade_carro; x++) {
			corrida[x] = new Carro("Carro " + NOME_CARRO[x], DISTANCIA_DA_CORRIDA);
			corrida[x].start();
		}
	}
}
