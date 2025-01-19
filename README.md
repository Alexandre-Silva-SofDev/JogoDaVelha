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

##📌 <span style="color:yellow;">Próximos Passos</span>
- Criar a classe **Controlador** para gerenciar o fluxo do jogo e as regras.
- Implementar a classe **Visão** para interação com os jogadores.
- Testar a integração das classes no padrão MVC.
