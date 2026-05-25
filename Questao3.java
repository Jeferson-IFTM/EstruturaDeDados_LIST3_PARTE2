package EstruturaDeDados.JEFERSON.TEST;

public class Questao3 {
    public static <T extends Comparable<T>> void reverse(MyLinkedList<T> list) {
        if (list.getHead() == null || list.getHead() == list.getTail()) return;

        MyLinkedList.Node<T> previous = null;
        MyLinkedList.Node<T> current = list.getHead();
        MyLinkedList.Node<T> nextNode = null;
        MyLinkedList.Node<T> oldHead = list.getHead();

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        list.setHead(previous);
        list.setTail(oldHead);
    }
}