# Atividade 1: Algoritmos em Listas Encadeadas Simples 🚀

Este repositório contém a resolução da lista de exercícios de fixação da disciplina de **Estrutura de Dados I** do curso de **Tecnologia em Análise e Desenvolvimento de Sistemas (IFTM - Campus Patrocínio)**.

O objetivo principal é a manipulação correta de ponteiros (`head`, `tail` e `next`), o controle de referências na memória Heap do Java e a otimização de algoritmos de busca e remoção em estruturas lineares dinâmicas.

---

## 📁 Estrutura do Projeto

O projeto foi totalmente modularizado, onde **cada questão está implementada em uma classe Java separada**, além de uma classe principal contendo um menu console interativo para testes em tempo real.

```text
src/EstruturaDeDados/JEFERSON/TEST/
│
├── MyLinkedList.java       # Estrutura base da lista ligada com encapsulamento (Getters/Setters)
├── Questao1.java           # [Q1] Inserção ordenada em ordem crescente (Sorted Insertion)
├── Questao2.java           # [Q2] Remoção de nó intermediário sem ponteiro predecessor
├── Questao3.java           # [Q3] Inversão de lista encadeada in-place (sem memória extra)
├── Questao4.java           # [Q4] Intercalação linear de duas listas ordenadas (Merge)
├── Questao5.java           # [Q5] Remoção do N-ésimo nó a partir do final (Algoritmo One-Pass)
└── Main.java               # Menu interativo via console para execução e testes das questões

🛠️ Descrição Técnica das SoluçõesQuestão 1: Inserção Ordenada (Questao1.java)Problema: Corrigir uma implementação falha de inserção ordenada.Solução: Tratamento rigoroso de estados críticos da estrutura: lista vazia, inserção na cabeça (menor valor), inserção na cauda (maior valor) atualizando o ponteiro tail, e inserção posicional no meio caminhando sequencialmente enquanto current.next.element < element.Questão 2: Remoção sem Predecessor (Questao2.java)Problema: Remover um nó P tendo acesso estritamente a ele, sem possuir a referência do head ou do nó anterior.Solução: Implementação de remoção lógica por substituição de conteúdo. O valor do nó sucessor (P.next.element) é copiado para dentro de P, e o link de P pula o seu vizinho da direita (P.next = P.next.next), isolando o nó duplicado para coleta do Garbage Collector.Questão 3: Inversão In-Place (Questao3.java)Problema: Inverter a ordem de todos os elementos da lista sem instanciar novos nós ou alocar memória extra ($O(1)$ em espaço).Solução: Utilização de três ponteiros auxiliares de navegação de estados (previous, current e nextNode). A cada iteração do laço, a direção do ponteiro current.next é invertida para apontar para o previous. Ao final, as variáveis globais head e tail são reposicionadas.Questão 4: Intercalação de Listas (Questao4.java)Problema: Unir duas listas simplesmente encadeadas que já se encontram ordenadas em uma única lista também ordenada.Solução: Algoritmo de ponteiros paralelos com complexidade de tempo linear $O(n + m)$. Avança o ponteiro da lista cujo elemento atual for menor, adicionando-o na lista resultante. Elementos remanescentes de listas de tamanhos desiguais são anexados diretamente ao final.Questão 5: Remoção do N-ésimo Nó do Fim (Questao5.java)Problema: Remover o $n$-ésimo nó contando de trás para frente em apenas uma única passagem (one-pass), sem consultar a propriedade size ou contar os nós previamente.Solução: Técnica de dois ponteiros com distanciamento constante (Ponteiros Rápido e Lento). O ponteiro fast avança $n$ posições à frente na lista. Em seguida, os ponteiros fast e slow movem-se em sincronia na mesma velocidade. Quando fast alcança o último nó, slow estará posicionado exatamente no nó predecessor do alvo a ser removido.💻 Como Rodar o ProjetoCertifique-se de que possui o JDK 8 ou superior instalado na sua máquina.Clone este repositório ou baixe os arquivos fonte.Coloque todas as classes dentro da mesma estrutura de diretório correspondente ao pacote: EstruturaDeDados/JEFERSON/TEST/.Compile os arquivos de dentro da pasta raiz do código fonte:Bashjavac EstruturaDeDados/JEFERSON/TEST/*.java
Execute a classe principal para abrir o menu:Bashjava EstruturaDeDados.JEFERSON.TEST.Main
🕹️ Demonstração do Menu InterativoAo rodar a classe Main, você interagirá com o seguinte console dinâmico, exibindo as amarrações em tempo real:Plaintext========= MENU DE SELEÇÃO =========
Estado da Lista: [10] -> [20] -> [30] -> [40] -> null

1. Inserir no final (addLast)
2. Inserção ordenada crescendo (Questão 1)
3. Remover nó do meio sem predecessor (Questão 2)
4. Inverter estrutura da lista (Questão 3)
5. Intercalar com outra lista ordenada (Questão 4)
6. Remover o n-ésimo nó a partir do final (Questão 5)
7. Exibir Lista
8. Limpar / Resetar Lista (clear)
0. Sair

Escolha uma opção: 
