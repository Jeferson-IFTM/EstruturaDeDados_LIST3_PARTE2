package EstruturaDeDados.JEFERSON.TEST;

public class Questao2 {
    public static <T extends Comparable<T>> void deleteNodeWithoutPredecessor(MyLinkedList.Node<T> P) {
        if (P == null || P.next == null) {
            System.out.println("Erro: Não é possível remover o último nó por este método.");
            return;
        }
        P.element = P.next.element;
        P.next = P.next.next;
    }
}
