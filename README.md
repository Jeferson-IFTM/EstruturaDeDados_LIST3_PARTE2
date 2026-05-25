🔗 Estrutura De Dados - Desafios de Lista EncadeadaEste repositório contém a implementação de uma lista simplesmente encadeada personalizada (MyLinkedList) e a resolução de 5 problemas clássicos de estrutura de dados desenvolvidos para a disciplina de Estrutura de Dados.🚀 Sobre o ProjetoA aplicação utiliza uma lista ligada simples dinâmica com referências para a cabeça (head) e cauda (tail). O foco principal do projeto é o entendimento profundo sobre manipulação de ponteiros, algoritmos de varredura e otimização de espaço em memória ($O(1)$ auxiliar).Funcionalidades Principais:Inserção Adaptativa: Organização automática de valores em ordem crescente diretamente na inserção.Remoção sem Predecessor: Algoritmo cirúrgico para deletar um nó intermediário tendo acesso apenas à sua própria referência.Inversão In-Place: Reversão completa dos ponteiros da lista sem gastar memória extra.Intercalação Linear: Fusão de duas listas já ordenadas mantendo a ordenação final de forma eficiente.Algoritmo One-Pass: Remoção do N-ésimo nó a partir do fim utilizando a técnica de dois ponteiros em uma única varredura.🛠️ Tecnologias e ConceitosLinguagem: Java 8+Estrutura de Dados: Lista Simplesmente Encadeada (Nós Dinâmicos)Conceitos: Manipulação de Ponteiros, Complexidade Algorítmica, Algoritmos In-Place e Técnicas de Dois Ponteiros (Fast and Slow).📂 Estrutura do CódigoPlaintextsrc/EstruturaDeDados/JEFERSON/TEST/
│
├── MyLinkedList.java      # Estrutura base da lista ligada com encapsulamento (Getters/Setters)
├── Questao1.java          # [Q1] Inserção ordenada em ordem crescente (Sorted Insertion)
├── Questao2.java          # [Q2] Remoção de nó intermediário sem ponteiro predecessor
├── Questao3.java          # [Q3] Inversão de lista encadeada in-place (sem memória extra)
├── Questao4.java          # [Q4] Intercalação linear de duas listas ordenadas (Merge)
├── Questao5.java          # [Q5] Remoção do N-ésimo nó a partir do final (Algoritmo One-Pass)
└── Main.java              # Menu interativo via console para execução e testes das questões
📈 Análise de Complexidade das SoluçõesOperação / QuestãoTempoEspaçoJustificativaQ1: Inserção Ordenada$O(n)$$O(1)$Varredura linear para encontrar a posição correta do elemento.Q2: Remoção sem Predecessor$O(1)$$O(1)$Copia o valor do próximo nó e altera o ponteiro diretamente, sem buscar a lista.Q3: Inversão In-Place$O(n)$$O(1)$Passagem única mudando a direção das referências com 3 ponteiros auxiliares.Q4: Intercalação de Listas$O(n + m)$$O(1)$Ponteiros paralelos avançando juntos baseado no menor valor das duas listas.Q5: Remoção do N-ésimo do Fim$O(n)$$O(1)$Algoritmo One-Pass usando ponteiros rápido/lento com espaçamento fixo de $n$ posições.💻 Como Rodar o ProjetoCertifique-se de que possui o JDK 8 ou superior instalado.Abra o terminal na pasta raiz do código fonte (antes da pasta EstruturaDeDados) e compile os arquivos:Bashjavac EstruturaDeDados/JEFERSON/TEST/*.java
Execute a classe principal para abrir o menu interativo:Bashjava EstruturaDeDados.JEFERSON.TEST.Main
🕹️ Demonstração do Menu InterativoAo rodar a classe Main, o console exibirá o estado atualizado da lista e as opções disponíveis para teste:Plaintext========= MENU DE SELEÇÃO =========
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
