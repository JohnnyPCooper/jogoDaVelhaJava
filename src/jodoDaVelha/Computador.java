package jodoDaVelha;

public class Computador {
	// Variável para representar a dificuldade
	private int dificuldade;
	
	// Função para o computador jogar no jogo
	void jogar(Tabuleiro tabuleiro) {
		// Recebe-se um tabuleiro auxiliar para fazer todo esse processo
		char tabuleiroAux[][] = tabuleiro.obterTabuleiro();
		// Percorre-se todo o tabuleiro procurando um local vazio, e se ele existir
		// um elemento de bolinha é adicionado em seu lugar
		if(dificuldade == 1) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(tabuleiroAux[i][j] == ' ') {
						tabuleiro.inserir(i, j, 'O');
						return;
					}
				}
			}
		}
		else if(dificuldade == 2) {
			for(int i = 0; i < 3; i++) {
				for(int j = 2; j > 0; j--) {
					if(tabuleiroAux[i][j] == ' ') {
						tabuleiro.inserir(i, j, 'O');
						return;
					}
				}
			}
		}
		else if(dificuldade == 3) {
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(tabuleiroAux[j][i] == ' ') {
						tabuleiro.inserir(j, i, 'O');
						return;
					}
				}
			}
		}
	}
	
	void escolherDificuldade(int dif) {
		dificuldade = dif;
	}
}
