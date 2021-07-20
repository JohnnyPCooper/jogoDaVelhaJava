package jodoDaVelha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		boolean rodando = true;
		System.out.println("Jogo da velha do João!");
		
		// Instanciando os objetos das classes necessárias
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();
		Computador computador = new Computador();
		
		// Definindo o nível de dificuldade
		System.out.println("\nEscolha o nível de dificuldade: 1, 2 ou 3\n");
		computador.escolherDificuldade(leitor.nextInt());
		
		// Mostrando o tabuleiro vazio
		tabuleiro.mostrarTabuleiro();
		while(rodando) {
			jogador.jogar(tabuleiro);
			tabuleiro.mostrarTabuleiro();
			computador.jogar(tabuleiro);
			tabuleiro.mostrarTabuleiro();
			rodando = tabuleiro.ganhou();
		}
	}

}
