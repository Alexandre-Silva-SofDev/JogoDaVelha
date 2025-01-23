package com.jogodavelha.controller;

import com.jogodavelha.model.Tabuleiro;
import com.jogodavelha.view.Visao;

/**
 * Classe Controlador que gerencia a lógica do jogo da velha.
 */
public class Controlador {
    private Tabuleiro tabuleiro;
    private char jogadorAtual;
    private Visao visao;

    public Controlador() {
        tabuleiro = new Tabuleiro();
        jogadorAtual = 'X'; // Começamos com o jogador 'X'.
        visao = new Visao();
    }

    /**
     * Alterna entre os jogadores 'X' ou 'O'.
     */
    private void alternarJogador() {
        jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
    }

    /**
     * Processa a jogada de um jogador.
     *
     * @param linha  A linha onde o jogador deseja jogar.
     * @param coluna A coluna onde o jogador deseja jogar.
     * @return true se a jogada for válida, false caso contrário.
     */
    public boolean processarJogada(int linha, int coluna) {
        if (tabuleiro.fazerJogada(linha, coluna, jogadorAtual)) {
            visao.exibirTabuleiro(tabuleiro);

            if (tabuleiro.verificarVitoria(jogadorAtual)) {
                visao.exibirMensagem("Jogador " + jogadorAtual + " venceu!");
                return true;
            } else if (tabuleiro.estaCheio()) {
                visao.exibirMensagem("O jogo terminou em empate!");
                return true;
            }
            alternarJogador();
        } else {
            visao.exibirMensagem("Jogada inválida. Tente novamente.");
        }
        return false;
    }

    /**
     * Inicia o jogo da velha.
     */
    public void iniciarJogo() {
        visao.exibirMensagem("Bem-vindo ao Jogo da Velha!");
        visao.exibirTabuleiro(tabuleiro);

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            visao.exibirMensagem("Jogador " + jogadorAtual + ", digite sua jogada (linha coluna):");
            String entrada = visao.capturarEntrada();
            if (entrada == null || entrada.trim().isEmpty()) {
                visao.exibirMensagem("Entrada inválida! Tente novamente.");
                continue;
            }

            try {
                String[] partes = entrada.split(" ");
                if (partes.length != 2) {
                    throw new IllegalArgumentException("Formato de entrada inválido.");
                }

                int linha = Integer.parseInt(partes[0]);
                int coluna = Integer.parseInt(partes[1]);

                if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
                    visao.exibirMensagem("Coordenadas fora dos limites! Tente novamente (valores entre 0 e 2).");
                    continue;
                }

                jogoAtivo = !processarJogada(linha, coluna);
            } catch (NumberFormatException e) {
                visao.exibirMensagem("Os valores devem ser números inteiros! Tente novamente.");
            } catch (IllegalArgumentException e) {
                visao.exibirMensagem(e.getMessage() + " Use o formato: linha coluna (ex: 1 2).");
            }
        }
        visao.exibirMensagem("Fim de jogo! Obrigado por jogar.");
        visao.fecharScanner();
    }
}