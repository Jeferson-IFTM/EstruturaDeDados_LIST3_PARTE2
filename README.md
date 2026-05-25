# 🔗 Estrutura De Dados - Desafios de Lista Encadeada

Este repositório contém a implementação de uma lista simplesmente encadeada personalizada (`MyLinkedList`) e a resolução de 5 problemas clássicos de estrutura de dados desenvolvidos para a disciplina de Estrutura de Dados.

---

## 🚀 Sobre o Projeto

A aplicação utiliza uma **lista ligada simples** dinâmica com referências para a cabeça (`head`) e cauda (`tail`). O foco principal do projeto é o entendimento profundo sobre manipulação de ponteiros, algoritmos de varredura e otimização de espaço em memória ($O(1)$ auxiliar).

### Funcionalidades Principais:
* **Inserção Adaptativa:** Organização automática de valores em ordem crescente diretamente na inserção.
* **Remoção sem Predecessor:** Algoritmo cirúrgico para deletar um nó intermediário tendo acesso apenas à sua própria referência.
* **Inversão In-Place:** Reversão completa dos ponteiros da lista sem gastar memória extra.
* **Intercalação Linear:** Fusão de duas listas já ordenadas mantendo a ordenação final de forma eficiente.
* **Algoritmo One-Pass:** Remoção do N-ésimo nó a partir do fim utilizando a técnica de dois ponteiros em uma única varredura.

---

## 🛠️ Tecnologias e Conceitos

* **Linguagem:** Java 8+
* **Estrutura de Dados:** Lista Simplesmente Encadeada (Nós Dinâmicos)
* **Conceitos:** Manipulação de Ponteiros, Complexidade Algorítmica, Algoritmos *In-Place* e Técnicas de Dois Ponteiros (*Fast and Slow*).

---

## 📂 Estrutura do Código

```text
src/EstruturaDeDados/JEFERSON/TEST/
│
├── MyLinkedList.java      # Estrutura base da lista ligada com encapsulamento (Getters/Setters)
├── Questao1.java          # [Q1] Inserção ordenada em ordem crescente (Sorted Insertion)
├── Questao2.java          # [Q2] Remoção de nó intermediário sem ponteiro predecessor
├── Questao3.java          # [Q3] Inversão de lista encadeada in-place (sem memória extra)
├── Questao4.java          # [Q4] Intercalação linear de duas listas ordenadas (Merge)
├── Questao5.java          # [Q5] Remoção do N-ésimo nó a partir do final (Algoritmo One-Pass)
└── Main.java              # Menu interativo via console para execução e testes das questões
