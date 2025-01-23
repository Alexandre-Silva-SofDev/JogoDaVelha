package com.jogodavelha.view;

import com.jogodavelha.model.Tabuleiro;

import java.util.Scanner;

/**
 * Classe responsável pela interação com os jogadores.
 * Exibe o estado do jogo e coleta as entradas dos usuários.
 */
public class Visao {

    private Scanner entradas;

    /**
     * Construtor da classe Visao.
     * Inicializa a classe Scanner para ler as entradas dos jogadores.
     */
    public Visao() {
        this.entradas = new Scanner(System.in);
    }

    /**
     * Exibe o tabuleiro do jogo no console.
     *
     * @param tabuleiro O tabuleiro do jogo em formato de matriz de caracteres.
     */
    public void exibirTabuleiro(Tabuleiro tabuleiro) {
        System.out.println("Estado atual do tabuleiro:");
        tabuleiro.exibirTabuleiro();
    }

    /**
     * Exibe uma mensagem informativa no console.
     *
     * @param mensagem A mensagem a ser exibida.
     */
    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    /**
     * Captura a entrada do usuário.
     *
     * @return A entrada do usuário como uma string.
     */
    public String capturarEntrada() {
        return entradas.nextLine();
    }

    /**
     * Fecha o Scanner após o término do jogo.
     */
    public void fecharScanner() {
        entradas.close();
    }
}