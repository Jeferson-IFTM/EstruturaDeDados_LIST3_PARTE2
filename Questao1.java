package EstruturaDeDados.JEFERSON.TEST;

public class Questao1 {
    public static <T extends Comparable<T>> void addAscendingSorted(MyLinkedList<T> list, T element) {
        // Caso Especial: Lista Vazia
        if (list.size() == 0) {
            MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(element);
            list.setHead(newNode);
            list.setTail(newNode);
            list.setSize(1);
            return;
        }

        if (list.getHead().element.compareTo(element) >= 0) {
            MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(element, list.getHead());
            list.setHead(newNode);
            list.setSize(list.size() + 1);
            return;
        }

        if (list.getTail().element.compareTo(element) <= 0) {
            MyLinkedList.Node<T> newNode = new MyLinkedList.Node<>(element);
            list.getTail().next = newNode;
            list.setTail(newNode);
            list.setSize(list.size() + 1);
            return;
        }

        MyLinkedList.Node<T> current = list.getHead();
        while (current.next != null && current.next.element.compareTo(element) < 0) {
            current = current.next;
        }
        current.next = new MyLinkedList.Node<>(element, current.next);
        list.setSize(list.size() + 1);
    }
}