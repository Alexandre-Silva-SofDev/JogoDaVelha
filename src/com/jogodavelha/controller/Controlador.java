package com.jogodavelha.controller;

import com.jogodavelha.model.Tabuleiro;


/***
 * classe Controlador que gerencia a lógica do jogo da velha.
 */
public class Controlador {
    private Tabuleiro tabuleiro;
    private char jogadorAtual;

    public Controlador(){
        tabuleiro = new Tabuleiro();
        jogadorAtual = 'X'; // Começamos com o jogador 'X'.
    }

    /***
     * Alterna entre os jogadores 'X' ou 'O'.
     */

    private void alternarJogador(){

        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    /***
     * Processa a jogada de um jogador.
     *
     * @param linha A linha onde o jogador deseja jogar.
     * @param coluna A coluna onde o jogador deseja jogar.
     * @return true se a jogada for válida, false caso contrária.
     */
    public boolean processarJogada(int linha, int coluna){
        if(tabuleiro.fazerJogada(linha, coluna, jogadorAtual)){
            if(tabuleiro.verificarVitoria(jogadorAtual)){
                System.out.println("Jogador" + jogadorAtual + "venceu!");
                return true;
            }else if(tabuleiro.estaCheio()){
                System.out.println("O jogo terminou em empate!");
                return true;
            }
            alternarJogador();
        }else{
            System.out.println("Jogada inválida. Tente novamente. ");
        }
        return false;
    }
    /***
     * Exibe o estado atual do tabuleiro.
     */
    public void exibirTabuleiro(){
        tabuleiro.exibirTabuleiro();
    }
}
