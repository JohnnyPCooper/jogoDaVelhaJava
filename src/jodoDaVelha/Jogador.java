package jodoDaVelha;
import java.util.Scanner;

public class Jogador {
	private final char peca = 'X';
	private int x = 0;
	private int y = 0;
	
	// Declarando o objeto responsável por fazer a leitura do código
	Scanner leitor = new Scanner(System.in);
	
	// A função recebe o tabuleiro e em seguida efetua a jogada, mudando-o conforme a jodada
	void jogar(Tabuleiro tabuleiro) {
		
		// Efetuando a leitura da coordenada X
		System.out.println("\n\nDeseja colocar em qual posição X?");
		x = leitor.nextInt();
		
		// Efetuando a leitura da coordenada Y
		System.out.println("Deseja colocar em qual posição Y?");
		y = leitor.nextInt();
		
		// Inserindo a jogada no tabuleiro
		tabuleiro.inserir(x, y, peca);
	}
	
}
