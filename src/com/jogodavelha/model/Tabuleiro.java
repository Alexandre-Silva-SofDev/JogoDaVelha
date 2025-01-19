package com.jogodavelha.model;

/**
 * Construtor que representa o tabuleiro do jogo da velha.
 */

public class Tabuleiro {

    private char[][] matriz; // Matriz que representa o tabuleiro.
    private static final int  TAMANHO = 3; // Tamanho fixo do tabuleiro (3x3).

    /**
     * Construtor do tabuleiro. Inicializa a matriz com espaços vazios.
     */

    public Tabuleiro(){
        matriz = new char[TAMANHO][TAMANHO];
        inicializarTabuleiro();
    }
    /***
     * Inicializa o tabuleiro preenchendo todas as posições com '-'.
     */

    private void inicializarTabuleiro(){

        for(int linha = 0; linha < TAMANHO; linha++){
            for(int coluna = 0; coluna < TAMANHO; coluna++ ){
                matriz[linha][coluna] = '-'; // Posição vazia.
            }
        }
    }
    /***
     * Realiza uma jogada no tabuleiro.
     *
     * @param linha A linha onde a jogada será feita.
     * @param coluna A coluna onde a jogada será feita.
     * @param simbolo o símbolo do jogador ('X' ou 'O').
     * @return true se a jogada foi realizada com sucesso, false caso contrário.
     */

    public boolean fazerJogada(int linha, int coluna, char simbolo){
        if(linha >= 0 && linha < TAMANHO && coluna >= 0 && coluna < TAMANHO && matriz[linha][coluna] == '-'){
            matriz[linha][coluna] = simbolo; // Preenche a posição com o símbolo do jogador.
            return true;
        }
        return false; // Jogada inválida.
    }

    /***
     * Verifica se há um vencedor no jogo.
     *
     * @param simbolo O símbolo do jogador ('X' ou 'O').
     * @return true se o jogador vencey, false caso contrário.
     */
    public boolean verificarVitoria(char simbolo){
        // Verifica as linhas e colunas.
        for(int i = 0; i < TAMANHO; i++){
            if((matriz[i][0] == simbolo && matriz[i][1] == simbolo && matriz[i][2] == simbolo) || //Linha.
                    (matriz[0][i] == simbolo && matriz[1][i] == simbolo && matriz[2][i] == simbolo)) { // Coluna.
                return true;

            }

        }
        // Verifica as diagonais.
        if((matriz[0][0] == simbolo && matriz[1][1] == simbolo && matriz[2][2 == simbolo) || // Diagonal principal.
                (matriz[0][2] == simbolo && matriz[1][1] == simbolo && matriz[2][0] == simbolo)) { // Diagonal secundária.
            return true;
    }
        return false; // Nenhuma condição  de vitória foi encontrada.
}
/***
 * Verifica se o tabuleiro está completamente preenchido.
 *
 * @return true se o tabuleiro estiver cheio, false caso contrário.
 */
public boolean estaCheio() {
     for(int linha = 0; linha < TAMANHO; linha++){
        for(int coluna = 0; coluna < TAMANHO; coluna++){
            if(matriz[linha][coluna] == '-'){
                return false; // Ainda há espaço vazio no tabuleiro.
            }
        }
     }
     return true; // Tabuleiro cheio.
 }
    /***
     * Imprime o estado atual do tabuleiro no console.
     */
    public void exibirTabuleiro(){
        for(int linha = 0; linha < TAMANHO; linha++){
            for(int coluna = 0; coluna < TAMANHO; coluna++){
                System.out.print(matriz[linha][coluna] + '-');

            }
            System.out.println();
        }
    }

}