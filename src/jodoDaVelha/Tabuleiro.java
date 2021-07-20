package jodoDaVelha;


public class Tabuleiro {
	
	// Declaração da matriz para representar o tabuleiro do jogo
	private char tabuleiro[][] = new char[3][3];
	
	// Aqui nós temos o método construtor que servirá para limpar o tabuleiro
	Tabuleiro() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
	// Função para que se consiga exibir o tabuleiro sempre que ele for atualizado
	void mostrarTabuleiro() {
		System.out.print("\n\n");
		System.out.printf (" %c | %c | %c \n", tabuleiro[0][0], tabuleiro[0][1], tabuleiro[0][2]);
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.printf (" %c | %c | %c \n", tabuleiro[1][0], tabuleiro[1][1], tabuleiro[1][2]);
		System.out.println("___|___|___");
		System.out.println("   |   |   ");
		System.out.printf (" %c | %c | %c ", tabuleiro[2][0], tabuleiro[2][1], tabuleiro[2][2]);
	}
	
	// A função abaixo serve para inserir uma peça ao tabuleiro, e para isso, faz a verificação do
	// suposto vazio que poderia existir ali
	
	void inserir(int x, int y, char peca) {
		if(tabuleiro[x][y] == ' ') {
			tabuleiro[x][y] = peca;
		}
		else {
			System.out.print("Você não pode colocar aqui!");
		}
	}
	
	// A função para que se possa obter o tabuleiro 
	char[][] obterTabuleiro(){
		return tabuleiro;
	}
	
	// O método para verificar se o jogo pode ser finalizado
	boolean ganhou() {
		// Variável de empate
		int empate = 0;
		// Verificação da diagonal principal
		if(tabuleiro[0][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[2][2] == 'O') {
			System.out.println("\nO computador ganhou!");
			return false;
		}
		else if(tabuleiro[0][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[2][2] == 'X'){
			System.out.println("\nO jogador ganhou!");
			return false;
		}
		
		// Verificação das linhas e colunas
		for(int i = 0; i < 3; i++) {
			if(tabuleiro[i][0] == 'O' && tabuleiro[i][1] == 'O' && tabuleiro[i][2] == 'O') {
				System.out.println("\nO computador ganhou!");
				return false;
			}else if(tabuleiro[i][0] == 'X' && tabuleiro[i][1] == 'X' && tabuleiro[i][2] == 'X') {
				System.out.println("\nO jogador ganhou!");
				return false;
			}else if(tabuleiro[0][i] == 'O' && tabuleiro[1][i] == 'O' && tabuleiro[2][i] == 'O') {
				System.out.println("\nO computador ganhou!");
				return false;
			}else if(tabuleiro[0][i] == 'X' && tabuleiro[1][i] == 'X' && tabuleiro[2][i] == 'X') {
				System.out.println("\nO jogador ganhou!");
				return false;
			}
		}
		
		// Verificação da diagonal secundária
		if(tabuleiro[2][0] == 'O' && tabuleiro[1][1] == 'O' && tabuleiro[0][2] == 'O') {
			System.out.println("\nO computador ganhou!");
			return false;
		}
		else if(tabuleiro[2][0] == 'X' && tabuleiro[1][1] == 'X' && tabuleiro[0][2] == 'X'){
			System.out.println("\nO jogador ganhou!");
			return false;
		}
		// Verificando oo empate, nesse caso se todas as casas foram ocupadas e
		// ele ainda não terminou
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(tabuleiro[i][j] != ' ') {
					empate++;
				}
			}
		}
		if(empate == 9) {
			System.out.print("Jogo empatado!");
			return false;
		}
		return true;
	}
}
