# <span style="color:yellow;">Jogo da Velha em Java </span>

Um jogo da velha simples desenvolvido em Java.

## 🚀<span style="color:yellow;"> Funcionalidades Previstas</span>

- Dois jogadores humanos poderão jogar entre si.
- Interface textual simples.
- Verificação de vitória e empate.

## 📦 <span style="color:yellow;"> Estrutura do Projeto</span>


```
src
└── com
    └── jogodavelha
        ├── Main.java
        ├── controller
        ├── model
        └── view

```


# 📝 <span style="color:yellow;">Implementações Recentes</span>

## Classe `Tabuleiro`
A classe `Tabuleiro` representa o tabuleiro do jogo da velha. Aqui estão as principais funcionalidades implementadas até agora:

- **Inicializar o tabuleiro**: Define um tabuleiro vazio (uma matriz 3x3 preenchida com `'-'`).
- **Fazer jogadas**: Permite registrar a jogada de um jogador, garantindo que a posição escolhida esteja disponível.
- **Verificar vitória**: Confere se um jogador venceu ao alinhar três símbolos iguais (em uma linha, coluna ou diagonal).
- **Checar empate**: Verifica se o tabuleiro está cheio, indicando um empate.
- **Exibir o tabuleiro**: Mostra o estado atual do jogo no console para os jogadores.


## Classe `Controlador`
A classe Controlador foi criada para gerenciar o fluxo do jogo. Suas principais responsabilidades são:

- **Gerenciar os turnos**: Alterna entre os jogadores 'X' e 'O'.
- **Processar jogadas**: Valida as entradas dos jogadores, atualiza o tabuleiro e verifica condições de vitória ou empate.
- **Exibir o tabuleiro**: Utiliza a funcionalidade da classe Tabuleiro para mostrar o estado atual do jogo no console.

##📌 <span style="color:yellow;">Próximos Passos</span>
- **Implementar a classe Visão** para gerenciar a interação com os jogadores.
- **Integrar as classes** Tabuleiro, Controlador e Visão para criar o fluxo completo do jogo.
- **Testar** o sistema e refinar a lógica do jogo para garantir usabilidade e funcionalidade.

