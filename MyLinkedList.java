package EstruturaDeDados.JEFERSON.TEST;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public static class Node<T> {
        public T element;
        public Node<T> next;

        public Node(T element) {
            this.element = element;
            this.next = null;
        }
        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }
    }

    public int size() { return this.size; }
    public Node<T> getHead() { return this.head; }
    public void setHead(Node<T> head) { this.head = head; }
    public Node<T> getTail() { return this.tail; }
    public void setTail(Node<T> tail) { this.tail = tail; }
    public void setSize(int size) { this.size = size; }

    public void addLast(T element) {
        Node<T> newNode = new Node<>(element);
        if (size == 0) { head = newNode; tail = newNode; }
        else { tail.next = newNode; tail = newNode; }
        size++;
    }

    public void printList() {
        if (size == 0) { System.out.println("Lista vazia."); return; }
        Node<T> current = head;
        while (current != null) {
            System.out.print("[" + current.element + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
