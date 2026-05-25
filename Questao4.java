package EstruturaDeDados.JEFERSON.TEST;

public class Questao4 {
    public static MyLinkedList<Integer> merge(MyLinkedList<Integer> l1, MyLinkedList<Integer> l2) {
        MyLinkedList<Integer> result = new MyLinkedList<>();
        MyLinkedList.Node<Integer> h1 = l1.getHead();
        MyLinkedList.Node<Integer> h2 = l2.getHead();

        while (h1 != null && h2 != null) {
            if (h1.element <= h2.element) {
                result.addLast(h1.element);
                h1 = h1.next;
            } else {
                result.addLast(h2.element);
                h2 = h2.next;
            }
        }
        while (h1 != null) { result.addLast(h1.element); h1 = h1.next; }
        while (h2 != null) { result.addLast(h2.element); h2 = h2.next; }
        return result;
    }
}
