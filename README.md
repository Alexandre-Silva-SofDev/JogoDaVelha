<span style="color:yellow;">Jogo da Velha em Java</span>
Um jogo da velha simples desenvolvido em Java.

🚀 <span style="color:yellow;">Funcionalidades Implementadas</span>
* Dois jogadores humanos podem jogar entre si.

* Interface textual simples para interação com o usuário.

* Verificação de vitória e empate.

* Alternância automática entre os jogadores 'X' e 'O'.

* Validação de jogadas para garantir que as posições escolhidas estejam dentro dos limites do tabuleiro e disponíveis.

📦 <span style="color:yellow;">Estrutura do Projeto</span>
src
└── com
└── jogodavelha
├── Main.java
├── controller
│   └── Controlador.java
├── model
│   └── Tabuleiro.java
└── view
└── Visao.java

📝 <span style="color:yellow;">Implementações Recentes</span>

# Classe Tabuleiro

 A classe Tabuleiro representa o tabuleiro do jogo da velha. Aqui estão as principais funcionalidades implementadas:

* Inicializar o tabuleiro: Define um tabuleiro vazio (uma matriz 3x3 preenchida com '-').

* Fazer jogadas: Permite registrar a jogada de um jogador, garantindo que a posição escolhida esteja disponível.

* Verificar vitória: Confere se um jogador venceu ao alinhar três símbolos iguais (em uma linha, coluna ou diagonal).

* Checar empate: Verifica se o tabuleiro está cheio, indicando um empate.

* Exibir o tabuleiro: Mostra o estado atual do jogo no console para os jogadores.

# Classe Controlador


A classe Controlador gerencia o fluxo do jogo. Suas principais responsabilidades são:

* Gerenciar os turnos: Alterna entre os jogadores 'X' e 'O'.

* Processar jogadas: Valida as entradas dos jogadores, atualiza o tabuleiro e verifica condições de vitória ou empate.

* Exibir o tabuleiro: Utiliza a funcionalidade da classe Tabuleiro para mostrar o estado atual do jogo no console.

* Iniciar o jogo: Controla o loop principal do jogo, solicitando jogadas dos usuários até que haja um vencedor ou empate.

# Classe Visao
A classe Visao é responsável pela interação com os jogadores. Suas funcionalidades incluem:

* Exibir o tabuleiro: Mostra o estado atual do tabuleiro no console.

* Exibir mensagens: Informa os jogadores sobre o estado do jogo (vitória, empate, jogada inválida, etc.).

* Capturar entradas: Lê as jogadas dos usuários a partir do console.

* Fechar o scanner: Encerra o Scanner após o término do jogo.

🎮 <span style="color:yellow;">Como Executar o Jogo</span>

**1.** Certifique-se de ter o Java Development Kit (JDK) instalado.

**2.** Clone o repositório ou copie os arquivos para o seu ambiente de desenvolvimento.

**3**.Compile e execute o programa a partir da classe `Main`:

``` bash

  javac com/jogodavelha/Main.java
  java com.jogodavelha.Main

```
**4.** Siga as instruções exibidas no console para jogar.

📌 <span style="color:yellow;">Próximos Passos</span>
* Melhorar a interface textual: Adicionar cores ou formatação para melhorar a experiência do usuário.

* Implementar um modo single-player: Adicionar um jogador controlado por IA (inteligência artificial) para jogar contra o usuário.

* Refatorar o código: Melhorar a organização e a legibilidade do código.

* Adicionar testes unitários: Garantir que todas as funcionalidades estejam funcionando corretamente.

🛠️ <span style="color:yellow;">Tecnologias Utilizadas</span>
Linguagem: Java

* Ferramentas: JDK, Git e IDE IntelliJ.

👨‍💻 <span style="color:yellow;">Autor</span>
Alexandre Silva

[GitHub](https://github.com/Alexandre-Silva-SofDev/JogoDaVelha)

[LinkedIn](https://www.linkedin.com/in/javadevelopper/)