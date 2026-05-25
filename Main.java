package EstruturaDeDados.JEFERSON.TEST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkedList<Integer> listaPrincipal = new MyLinkedList<>();

        listaPrincipal.addLast(10);
        listaPrincipal.addLast(20);
        listaPrincipal.addLast(30);
        listaPrincipal.addLast(40);

        int opcao;
        do {
            System.out.println("\n========= MENU INTERATIVO - LISTAS LIGADAS =========");
            System.out.print("Lista Atual: ");
            listaPrincipal.printList();
            System.out.println("Tamanho atual: " + listaPrincipal.size());
            System.out.println("----------------------------------------------------");
            System.out.println("1. [Questão 1] Inserção Ordenada (addAscendingSorted)");
            System.out.println("2. [Questão 2] Remover Nó sem Predecessor (Nó intermediário)");
            System.out.println("3. [Questão 3] Inverter Lista (reverse)");
            System.out.println("4. [Questão 4] Intercalar Duas Listas Ordenadas (Merge)");
            System.out.println("5. [Questão 5] Remover o N-ésimo Nó a partir do Final");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número para inserir ordenadamente: ");
                    int num = scanner.nextInt();
                    Questao1.addAscendingSorted(listaPrincipal, num);
                    System.out.println("Operação finalizada!");
                    break;

                case 2:
                    System.out.println("Simulando remoção do SEGUNDO nó da lista sem ponteiro anterior...");
                    if (listaPrincipal.getHead() != null && listaPrincipal.getHead().next != null) {
                        MyLinkedList.Node<Integer> alvo = listaPrincipal.getHead().next;
                        System.out.println("Nó alvo capturado possui o valor: " + alvo.element);
                        Questao2.deleteNodeWithoutPredecessor(alvo);
                        listaPrincipal.setSize(listaPrincipal.size() - 1);
                        System.out.println("Remoção concluída!");
                    } else {
                        System.out.println("A lista não possui nós intermediários para o teste.");
                    }
                    break;

                case 3:
                    System.out.println("Invertendo a estrutura de ponteiros da lista...");
                    Questao3.reverse(listaPrincipal);
                    System.out.println("Lista totalmente invertida!");
                    break;

                case 4:
                    System.out.println("Gerando duas listas pré-definidas e ordenadas para mesclagem:");
                    MyLinkedList<Integer> listaA = new MyLinkedList<>();
                    MyLinkedList<Integer> listaB = new MyLinkedList<>();
                    listaA.addLast(1); listaA.addLast(3); listaA.addLast(5);
                    listaB.addLast(2); listaB.addLast(4); listaB.addLast(6);
                    System.out.print("Lista A: "); listaA.printList();
                    System.out.print("Lista B: "); listaB.printList();

                    MyLinkedList<Integer> resultadoMerge = Questao4.merge(listaA, listaB);
                    System.out.print("Resultado do Merge: ");
                    resultadoMerge.printList();
                    break;

                case 5:
                    System.out.print("Digite a posição 'N' (de trás para frente) para remoção: ");
                    int n = scanner.nextInt();
                    Questao5.removeNthFromEnd(listaPrincipal, n);
                    System.out.println("Operação processada.");
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção incorreta.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}